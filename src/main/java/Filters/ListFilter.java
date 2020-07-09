package Filters;
import WebApp.UserServlet;
import javax.servlet.*;
import java.io.IOException;

public class ListFilter implements Filter
{
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException
    {
        response.setContentType("text/html; charset=UTF-8");
        if(UserServlet.current_user==null) { request.getRequestDispatcher("/Login").include(request, response); }
        else { request.getRequestDispatcher("/ListServlet").include(request, response); }
    }
}