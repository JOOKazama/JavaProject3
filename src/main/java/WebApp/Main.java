package WebApp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import Tables.User;
import Tables.UserCRUD;
import Tables.UserXML;
import ValAndDb.Validators;

public class Main extends HttpServlet
{
    public static String name;
    UserXML user_xml=new UserXML();
    UserCRUD user_crud=new UserCRUD();
    FromToXML from_to_xml=new FromToXML();
    ArrayList<User>array_list_users=new ArrayList<>();
    Validators validator=new Validators();
    private static final long serialVersionUID=1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        validator.ValidatorCreate(request.getParameter("name"), request.getParameter("username"),
        request.getParameter("password"), request.getParameter("password1"));

        if(validator.getError().equals(""))
        {
            User user=new User();
            user.setName(request.getParameter("name"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setJob("Enter a job!");
            user.setDescription("Enter a description!");
            user.setJava(0);
            user.setHtml(0);
            user.setCss(0);
            user.setJs(0);
            user.setCom(0);
            user.setTeam(0);
            user.setCre(0);
            user.setEmail("Enter an e-mail!");
            user.setCity("Enter a city!");
            user.setTel("Enter a tel!");
            user.setStreet("Enter a street!");
            user_crud.saveUser(user);

            try { user_xml=from_to_xml.FromXML("/xmllist.xml"); }
            catch(JAXBException e) { e.printStackTrace(); }

            array_list_users=user_xml.getUsers();
            array_list_users.add(user);
            user_xml.setUsers(array_list_users);

            try { from_to_xml.ToXML("/xmllist.xml", user_xml); }
            catch(JAXBException e) { e.printStackTrace(); }

            response.sendRedirect("Login");
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
        request.getRequestDispatcher("/index.jsp").include(request, response);
    }
}