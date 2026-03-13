//s/21/357

package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/EnrollServlet")
public class EnrollServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int courseId = Integer.parseInt(request.getParameter("courseId"));

        HttpSession session = request.getSession();

        List<Integer> enrolled = (List<Integer>) session.getAttribute("enrolled");

        if(enrolled == null){
            enrolled = new ArrayList<>();
        }

        enrolled.add(courseId);

        session.setAttribute("enrolled", enrolled);

        response.sendRedirect("DashboardServlet");
    }
}