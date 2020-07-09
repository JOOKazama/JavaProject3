package WebApp;
import Tables.User;
import Tables.UserCRUD;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditSecond extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        User user=(User)request.getSession().getAttribute("senduser");
        user.setJava(Integer.parseInt((String)request.getSession().getAttribute("java")));
        user.setHtml(Integer.parseInt((String)request.getSession().getAttribute("html")));
        user.setCss(Integer.parseInt((String)request.getSession().getAttribute("css")));
        user.setJs(Integer.parseInt((String)request.getSession().getAttribute("js")));
        user.setCom(Integer.parseInt((String)request.getSession().getAttribute("com")));
        user.setTeam(Integer.parseInt((String)request.getSession().getAttribute("team")));
        user.setCre(Integer.parseInt((String)request.getSession().getAttribute("cre")));
        UserCRUD.updateUser(user);
        response.sendRedirect("ShowUser");
    }
}
