package WebApp;
import Tables.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowUser extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        if(request.getParameter("reg")!=null) { response.sendRedirect("Main"); }
        else if(request.getParameter("list")!=null) { response.sendRedirect("ListServlet"); }
        else if(request.getParameter("exit")!=null)
        {
            response.sendRedirect("Login");
            UserServlet.current_user=null;
        }

        if(request.getParameter("first")!=null)
        {
            User user=(User)request.getSession().getAttribute("user");
            request.getSession().setAttribute("senduser", user);
            request.getSession().setAttribute("firstname", request.getParameter("name"));
            request.getSession().setAttribute("des", request.getParameter("area"));
            request.getSession().setAttribute("job", request.getParameter("job"));
            response.sendRedirect("EditFirst");
        }

        if(request.getParameter("second")!=null)
        {
            User user=(User)request.getSession().getAttribute("user");
            request.getSession().setAttribute("senduser", user);
            request.getSession().setAttribute("com", request.getParameter("com"));
            request.getSession().setAttribute("cre", request.getParameter("cre"));
            request.getSession().setAttribute("css", request.getParameter("css"));
            request.getSession().setAttribute("html", request.getParameter("html"));
            request.getSession().setAttribute("java", request.getParameter("java"));
            request.getSession().setAttribute("js", request.getParameter("js"));
            request.getSession().setAttribute("team", request.getParameter("team"));
            response.sendRedirect("EditSecond");
        }

        if(request.getParameter("third")!=null)
        {
            User user=(User)request.getSession().getAttribute("user");
            request.getSession().setAttribute("senduser", user);
            request.getSession().setAttribute("email", request.getParameter("email"));
            request.getSession().setAttribute("street", request.getParameter("street"));
            request.getSession().setAttribute("tel", request.getParameter("tel"));
            request.getSession().setAttribute("city", request.getParameter("city"));
            response.sendRedirect("EditThird");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        if(UserServlet.current_user!=null)
        { request.getRequestDispatcher("/index2.jsp").include(request, response); }
        else { request.getRequestDispatcher("/Login").include(request, response); }
    }
}