package WebApp;
import Tables.User;
import Tables.UserCRUD;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet
{
    public static User current_user;
    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter print_writer=response.getWriter();
        String username=(String)request.getSession().getAttribute("username");
        current_user=UserCRUD.getUser(username);

        if(current_user.getUsername()==null) { print_writer.println("No such user!"); }
        else
        {
            response.setContentType("text/html; charset=UTF-8");
            request.getSession().setAttribute("user", current_user);
            response.sendRedirect("ShowUser");
        }
    }

    @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    { doPost(req, resp); }
}