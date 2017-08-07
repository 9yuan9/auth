package com.hzit.servlet;

import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resourcces;
import com.hzit.entity.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/7.
 */
@WebServlet(name = "UpdateResourceServlet",value = "/updateResource.action")
public class UpdateResourceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Userinfo userinfo = (Userinfo) request.getSession().getAttribute("username");
        Object id=request.getSession().getAttribute("id");
        int rid=Integer.parseInt(String.valueOf(id));
        request.setCharacterEncoding("UTF-8");
        String rname = request.getParameter("rname");
        String rul = request.getParameter("rul");
        String resource = request.getParameter("resource");
        int rorderno = Integer.parseInt(request.getParameter("rorderno"));
        String description = request.getParameter("description");
        Resourcces r = new Resourcces();
        r.setRid(rid);
        r.setRname(rname);
        r.setResurl(rul);
        r.setParentID(resource);
        r.setResorderno(rorderno);
        r.setRedsdes(description);
        r.setUpdateMan(userinfo.getUname());
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        r.setUpdatetime(df.format(date));
        ResourccesDao dao = SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        int num = dao.updateResourccess(r);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        if(num==1){
            response.sendRedirect("allResource");
        }else{
            response.getWriter().append("Sorry!SYSTEM ERROR!/(ToT)/~~");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
