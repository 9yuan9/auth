package com.hzit.servlet;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.Userinfodao;
import com.hzit.entity.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "LoginServlet",value ="/login")
public class LoginServlet extends HttpServlet {
    Userinfodao dao = SqlSessionHelper.getSqlSession().getMapper(Userinfodao.class);

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        List<Userinfo> user = dao.findUserNameAndPwd(name, pwd);
        if (user == null) {
            out.print("<center><h1>登录失败！账户或密码错误！</h1></center>");
        } else {
            request.setAttribute("username", user);
            request.getSession().setAttribute("username", user);
            response.sendRedirect("index.jsp");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
