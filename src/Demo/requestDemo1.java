package Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Demo.requestDemo1")
public class requestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  /*
        1. 获取请求方式 ：GET
        - String getMethod()
        2. 获取虚拟目录：/day21
        - String getContextPath()
        3. 获取Servlet路径: /demo1
        - String getServletPath()
        4. 获取get方式请求参数：name=zhangsan
        - String getQueryString()
        5. 获取请求URI：/day21/demo1
        - String getRequestURI():		/day21/demo1
        - StringBuffer getRequestURL()  :http://localhost/day21/demo1
        - URL:统一资源定位符 ：http://localhost/day21/demo1	中华人民共和国
        - URI：统一资源标识符 :/day21/demo1					共和国
        6. 获取协议及版本：HTTP/1.1
        - String getProtocol()
        7. 获取客户机的IP地址：
        - String getRemoteAddr()
         */
        String method = request.getMethod();
        System.out.println("请求得方式："+method);

        String contextPath = request.getContextPath();
        System.out.println("虚拟目录："+contextPath);

        String servletPath = request.getServletPath();
        System.out.println("获取servlet路径："+servletPath);

        String queryString = request.getQueryString();
        System.out.println("获取get请求得方式："+queryString);

        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("获取请求URI"+requestURI);
        System.out.println("获取请求URL"+requestURL);

        String protocol = request.getProtocol();
        System.out.println("获取协议及版本"+protocol);

        String remoteAddr = request.getRemoteAddr();
        System.out.println("获取客户机得ip地址"+remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
