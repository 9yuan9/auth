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
 * Created by acer on 2017/8/4.
 */
@WebServlet(name = "RoleServlet", value = "/rolelist")
public class RoleServlet extends HttpServlet {
    RoleinfoDao roleinfoDao = SqlSessionHelper.getSqlSession().getMapper(RoleinfoDao.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Roleinfo> allRole = roleinfoDao.findAll();
        request.setAttribute("allRole", allRole);
        request.getRequestDispatcher("role.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
