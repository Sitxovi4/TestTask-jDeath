<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestTask</title>
</head>
    <body>
    <form action="${pageContext.request.contextPath}/Servlet"  method="post">
        <input type="text" name="richest_user" value="richest user">
        <input type="submit" name="button1" value="get">
        <br>
        <input type="text" name="account_sum" value="accounts sum">
        <input type="submit" name="button2" value="get">
    </form>

    </body>
</html>
