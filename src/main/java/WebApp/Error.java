package WebApp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Error extends HttpServlet
{
    private static final long serialVersionUID=1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Throwable exception=(Throwable)request.getAttribute("javax.servlet.error.exception");
        Integer status_code=(Integer)request.getAttribute("javax.servlet.error.status_code");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<html>\n <head><title> Error information </title></head>\n <body bgcolor=\"papayawhip\">\n");

        if(exception==null && status_code==null)
        {
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("/index3.jsp").include(request, response);
        }
        else if(status_code!=null)
        {
            if(status_code==404) out.println("Code: "+status_code+"</br> Page Not Found!");
            else if(status_code==403) out.println("Code: "+status_code+"</br> Page Forbidden!");
            else if(status_code==500) out.println("Code: "+status_code+"</br> Error!");
        }
        else { out.println("<h2>Error occurred!</h2>"); }
        out.println("</body>");
        out.println("</html>");
    }
}