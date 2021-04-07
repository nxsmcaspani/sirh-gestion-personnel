import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ListerCollaborateursController", value = "/collaborateurs")
public class ListerCollaborateursController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String withPictureParam = request.getParameter("withPicture");
        String departmentParam = request.getParameter("department");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>Collaborateurs liste</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>List of the collaborators</h1>");
            writer.println("<ul>");
            writer.println("<li>with Pictures : "+withPictureParam+"</li>");
            writer.println("<li>department : "+departmentParam+"</li>");
            writer.println("</ul>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
