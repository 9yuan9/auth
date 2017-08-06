package com.hzit.servlet;

import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/6.
 */
@WebServlet(name = "DeleteResourceServlet",value = "/deleteResource.action")
public class DeleteResourceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        ResourccesDao dao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        int num=dao.deleteResourccess(id);
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
