package com.hzit.servlet;

import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserinfoDao;
import com.hzit.entity.Resourcces;
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
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserinfoDao dao = SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);
        ResourccesDao resourccesDao=SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        Userinfo userinfo=new Userinfo();
        userinfo.setUname(name);
        userinfo.setUpass(pwd);
        Userinfo user=dao.findUserNameAndPwd(userinfo);
        if (user != null) {
            List<Resourcces> reslist =resourccesDao.findByResourccessByUid(user.getUid());
            request.setAttribute("username", user);
            request.getSession().setAttribute("username", user);
            request.getSession().setAttribute("reslist", reslist);
            response.sendRedirect("index.jsp");
        } else {
            out.print("<center><h1>登录失败！账户或密码错误！</h1><br>" +
                    "<a href='login.html'>点此返回</a></center>");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
