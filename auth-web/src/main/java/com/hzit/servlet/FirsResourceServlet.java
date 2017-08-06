package com.hzit.servlet;

import com.hzit.dao.ResourccesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resourcces;

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
@WebServlet(name = "FirsResourceServlet",value ="/toAddResource" )
public class FirsResourceServlet extends HttpServlet {
    ResourccesDao resourccesDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        resourccesDao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        List<Resourcces> list=resourccesDao.findFirstResourcces();
        request.setAttribute("firstlist",list);
        SqlSessionHelper.closeSession();
        request.getRequestDispatcher("addResources.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
