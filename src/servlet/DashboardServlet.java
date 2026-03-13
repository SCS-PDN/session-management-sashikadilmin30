
//s/21/357

package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Course> courses = new ArrayList<>();

        courses.add(new Course(101, "Web Programming", "Dr Silva"));
        courses.add(new Course(102, "Database Systems", "Dr Perera"));
        courses.add(new Course(103, "Software Engineering", "Dr Fernando"));

        request.setAttribute("courses", courses);

        RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
        rd.forward(request, response);
    }
}