<%--
  Created by IntelliJ IDEA.
  User: New User
  Date: 17.02.2020
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="userForm" action="/ServletProject_war_exploded/test?action=mainPage" method="post">
        <input type="text" name="userName" placeholder="type your name" size="20"/>
        Enter your name<input type="submit" value="Enter"/>
    </form>
</body>
</html>
