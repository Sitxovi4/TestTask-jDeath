<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestTask</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Servlet"  method="post">
        <%=request.getAttribute("richestuser")%>

        <br>
        <input type="text" name="account_sum" value="accounts sum">
        <input type="submit" name="button2" value="get">
    </form>

</body>
</html>
