package com.hzit.servlet;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.Userinfodao;
import com.hzit.entity.Userinfo;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("cardID");
        String pwd=request.getParameter("password");
        SqlSession session= SqlSessionHelper.getSqlSession();
        Userinfodao dao=session.getMapper(Userinfodao.class);
        List<Userinfo> user=dao.findUser();
        for(Userinfo u:user){
            out.println(u);
        }
        /*if(user==null){
            out.print("<center><h1>登录失败！账户或密码错误！</h1></center>");
        }else{
				*//*out.print("<center><h1>登录成功！</h1></center>");
	        	out.print("<center><h2>卡号："+card.getCardId());
	    		out.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp余额："+card.getBalance()+"</h2></center>");*//*
            request.setAttribute("user", user);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("success.html");
        }*/
        out.close();
    }
}
