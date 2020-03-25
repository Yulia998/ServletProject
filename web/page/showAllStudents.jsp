<%@ page import="test.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: New User
  Date: 24.02.2020
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <% List<Student> studentList = (List<Student>) session.getAttribute("studentList"); %>
        <% for (Student student : studentList) { %>
            <input type="checkbox" name="students" id="<%= student.getId()%>" value="<%= student.getId()%>"> <%= student.getName()%><br>
        <% } %>
    </div>
</body>
</html>
