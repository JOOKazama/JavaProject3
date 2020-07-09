package WebApp;
import Tables.User;
import Tables.UserCRUD;
import javax.servlet.http.*;
import java.io.IOException;

public class UserServlet extends HttpServlet
{
    public static User current_user;
    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String username=(String)request.getSession().getAttribute("username");
        current_user=UserCRUD.getUser(username);

        if(current_user.getUsername()==null) { response.getWriter().println("No such user!"); }
        else
        {
            response.setContentType("text/html; charset=UTF-8");
            request.getSession().setAttribute("user", current_user);
            response.sendRedirect("ShowUser");
        }
    }

    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    { doPost(request, response); }
}