package com.hzit.servlet;

import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.Userinfodao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "ResourceServlet")
public class ResourceServlet extends HttpServlet {
    ResourccesDao dao = SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
