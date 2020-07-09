package WebApp;
import Tables.User;
import Tables.UserCRUD;
import Tables.UserXML;
import ValAndDb.Validators;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public class Login extends HttpServlet
{
    UserXML user_xml=new UserXML();
    UserCRUD user_crud=new UserCRUD();
    List<User>list_user=UserCRUD.getAll();
    FromToXML from_to_xml=new FromToXML();
    Validators validator=new Validators();
    private static final long serialVersionUID=1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        validator.ValidatorLogin(request.getParameter("username"), request.getParameter("password"));

        if(validator.getError().equals(""))
        {
            try { user_xml=from_to_xml.FromXML("/xmllist.xml"); }
            catch(JAXBException e) { e.printStackTrace(); }

            for(User user:user_xml.getUsers())
            {
                int i=0;
                for(User u1:list_user)
                {
                    if(!user.getUsername().equals(u1.getUsername()))
                    {
                        i++;
                        if(i==list_user.size()) user_crud.saveUser(user);
                    }
                }
            }

            request.getSession().setAttribute("username", request.getParameter("username"));
            response.sendRedirect("UserServlet");
        }
        else
        {
            response.getWriter().println(validator.getError());
            validator.setError("");
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        request.getRequestDispatcher("/index1.5.jsp").include(request, response);
    }
}