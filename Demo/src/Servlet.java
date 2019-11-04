import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class Servlet extends GenericServlet {
     
    @Override
    public void init() {
        // initialize the servlet, and print something in the console.
        System.out.println("Servlet Initialized!");
    }
 
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
         
        // the service method will 
        response.setContentType("text/html");
         
        PrintWriter out = response.getWriter();
        out.println("Servlet called from jsp page!");
    }
     
    @Override
    public void destroy() {
        // close connections etc.
    }
}