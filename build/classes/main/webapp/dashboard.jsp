


<%@ page import="java.util.*, servlet.Course" %>

<h2>Available Courses</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Course</th>
<th>Instructor</th>
<th>Action</th>
</tr>

<%
List<Course> courses = (List<Course>) request.getAttribute("courses");

if(courses != null){
    for(Course c : courses){
%>

<tr>
<td><%= c.getCourseId() %></td>
<td><%= c.getCourseName() %></td>
<td><%= c.getInstructor() %></td>

<td>
<a href="EnrollServlet?courseId=<%=c.getCourseId()%>">Enroll</a>
</td>

</tr>

<%
    }
}
%>

</table>

<br>

<a href="LogoutServlet">Logout</a>