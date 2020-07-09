package WebApp;
import Tables.User;
import Tables.UserCRUD;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditThird extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        User user=(User)request.getSession().getAttribute("senduser");
        user.setEmail((String)request.getSession().getAttribute("email"));
        user.setCity((String)request.getSession().getAttribute("city"));
        user.setTel((String)request.getSession().getAttribute("tel"));
        user.setStreet((String)request.getSession().getAttribute("street"));
        UserCRUD.updateUser(user);
        response.sendRedirect("ShowUser");
    }
}