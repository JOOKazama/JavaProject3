package WebApp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckUser extends HttpServlet
{
    private static final long serialVersionUID=1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    { if(request.getParameter("back")!=null) { response.sendRedirect("ListServlet"); } }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        request.getSession().setAttribute("clicked_username", request.getParameter("export"));

        if(UserServlet.current_user==null) { request.getRequestDispatcher("/Login").include(request, response); }
        else { request.getRequestDispatcher("/index5.jsp").include(request, response); }
    }
}