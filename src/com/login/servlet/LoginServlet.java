package com.login.servlet;

import com.login.dao.AccountDao;
import com.login.dao.AccountDaoImpl;
import com.login.domain.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取参数
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println("用户名是："+name);
        System.out.println("密码是："+pwd);

        //判断用户名和密码是否正确,去查询数据库

        AccountDao accountDao=new AccountDaoImpl();
        Account account = accountDao.findAccount(name, pwd);
        if(account!=null){
        request.getRequestDispatcher("/successServlet").forward(request,response);
        }else{
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
