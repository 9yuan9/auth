package com.hzit.servlet;

import com.hzit.dao.RoleinfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Roleinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
@WebServlet(name = "AllRoleServlet",value = "/toAllRole")
public class AllRoleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoleinfoDao dao= SqlSessionHelper.getSqlSession().getMapper(RoleinfoDao.class);
        List<Roleinfo> allRole=dao.findAll();
        request.setAttribute("allRole",allRole);
        request.getRequestDispatcher("allRole.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
