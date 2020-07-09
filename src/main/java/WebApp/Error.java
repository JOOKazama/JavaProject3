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
        Throwable throwable=(Throwable)request.getAttribute("javax.servlet.error.exception");
        Integer code=(Integer)request.getAttribute("javax.servlet.error.status_code");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<html>\n <head><title> Error information </title></head>\n <body bgcolor=\"papayawhip\">\n");

        if (throwable==null && code==null)
        {
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("/index1.5.jsp").include(request, response);
        }
        else if (code!=null)
        {
            if(code==404) out.println("Code: "+code+"</br> Page Not Found!");
            else if(code==403) out.println("Code: "+code+"</br> Page Forbidden!");
            else if(code==500) out.println("Code: "+code+"</br> Error!");
        }
        else { out.println("<h2>Error occurred!</h2>"); }
        out.println("</body>");
        out.println("</html>");
    }
}