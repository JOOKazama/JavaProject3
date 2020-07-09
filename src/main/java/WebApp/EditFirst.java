package WebApp;
import Tables.User;
import Tables.UserCRUD;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditFirst extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        User user=(User)request.getSession().getAttribute("senduser");
        user.setName((String)request.getSession().getAttribute("firstname"));
        user.setDescription((String)request.getSession().getAttribute("des"));
        user.setJob((String)request.getSession().getAttribute("job"));
        UserCRUD.updateUser(user);
        response.sendRedirect("ShowUser");
    }
}