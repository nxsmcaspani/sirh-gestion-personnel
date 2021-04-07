import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EditerCollaborateursControlleur", value = "/collaborateurs/editer")
public class EditerCollaborateursControlleur extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String matricule = request.getParameter("matricule");
        String title = request.getParameter("title");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        if(matricule == null || matricule.isEmpty()){
            response.setStatus(400);
            response.getWriter().write("A matricule is  required.");
        } else {
            response.setStatus(400);
            try (PrintWriter writer = response.getWriter()) {
                writer.println("<!DOCTYPE html><html>");
                writer.println("<head>");
                writer.println("<meta charset=\"UTF-8\" />");
                writer.println("<title>Collaborators Edition</title>");
                writer.println("</head>");
                writer.println("<body>");
                writer.println("<h1>Collaborator Edition</h1>");
                writer.println("<p>Matricule : "+matricule);
                writer.println("</p>");
                writer.println("</body>");
                writer.println("</html>");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String matricule = request.getParameter("matricule");
        String title = request.getParameter("title");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        if(matricule == null || matricule.isEmpty() || title == null || title.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty() ){
            response.setStatus(400);
            try (PrintWriter writer = response.getWriter()) {
                writer.println("<!DOCTYPE html><html>");
                writer.println("<head>");
                writer.println("<meta charset=\"UTF-8\" />");
                writer.println("<title>Collaborators Edition</title>");
                writer.println("</head>");
                writer.println("<body>");
                writer.println("<h1>Collaborator Edition</h1>");
                writer.println("<p>Following parameter(s) are missing or incorrect : <br>");
                writer.println("<ul>");
                if(matricule == null || matricule.isEmpty()) {
                    writer.println("<li>matricule : "+matricule);
                }
                if(title == null || title.isEmpty()) {
                    writer.println("<li>title : "+title);
                }
                if(name == null || name.isEmpty()) {
                    writer.println("<li>name : "+name);
                }
                if(surname == null || surname.isEmpty()) {
                    writer.println("<li>surname : "+surname);
                }
                writer.println("</ul>");
                writer.println("</p>");
                writer.println("</body>");
                writer.println("</html>");
            }
        } else {
            response.setStatus(201);
            try (PrintWriter writer = response.getWriter()) {
                writer.println("<!DOCTYPE html><html>");
                writer.println("<head>");
                writer.println("<meta charset=\"UTF-8\" />");
                writer.println("<title>Collaborators Edition</title>");
                writer.println("</head>");
                writer.println("<body>");
                writer.println("<p>Creation of a collaborator with following information : <br>");
                writer.println("matricule="+matricule+",title="+title+",name="+name+",surname="+surname);
                writer.println("</p>");
                writer.println("</body>");
                writer.println("</html>");
            }
        }
    }
}
