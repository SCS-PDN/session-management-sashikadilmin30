
//s/21/357


package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        
        if(username.equals("student1") && password.equals("pass1")) {

            
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60*60); 
            response.addCookie(cookie);

            
            response.sendRedirect("DashboardServlet");

        } else {

            
            response.sendRedirect("index.html");

        }
    }
}