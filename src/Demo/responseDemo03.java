package Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/Demo.responseDemo03")
public class responseDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("responseDemo03被访问了");
/*        *//*设置状态码302*//*
        response.setStatus(302);
        *//*设置响应头location*//*
        response.setHeader("location","/day22/Demo.responseDemo04");*/

       /* response.sendRedirect("/day22/Demo.responseDemo04");*/
        response.sendRedirect("https://www.hao8090.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
