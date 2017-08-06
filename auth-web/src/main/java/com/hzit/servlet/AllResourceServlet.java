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
import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
@WebServlet(name = "AllResourceServlet",value = "/allResource")
public class AllResourceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResourccesDao dao = SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        List<Resourcces> resourcces=dao.findAll();
        request.setAttribute("allresource",resourcces);
        request.getRequestDispatcher("resource.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
