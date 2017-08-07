package com.hzit.servlet;

import com.hzit.dao.RoleinfoDao;
import com.hzit.dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/7.
 */
@WebServlet(name = "DeleteRoleServlet",value = "/deleteRole.action")
public class DeleteRoleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id= request.getParameter("id");
        RoleinfoDao dao= SqlSessionHelper.getSqlSession().getMapper(RoleinfoDao.class);
        int num=dao.deleteRole(id);
        if(num==1){
            response.sendRedirect("toAllRole");
        }else{
            response.getWriter().append("Sorry!SYSTEM ERROR!/(ToT)/~~");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
