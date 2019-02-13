
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String value = request.getParameter("name");
        String htmlSyntax = "<html><h3>HEY</h3></html>";    
        PrintWriter writer = response.getWriter();
        writer.write(htmlSyntax+" "+value);
    }

    

}
