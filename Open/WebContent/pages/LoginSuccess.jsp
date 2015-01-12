<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="Login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<%
String uname = (String) request.getParameter("uname");
 if (uname == null)
{
 response.sendRedirect("Login.jsp");
}
%>

</head>
<body>
<table>
<tr>
<h1>Welcome <%=uname%></h1>
</tr>
<tr>
<h1></h1><a href="Logout.jsp"> Logout </a></h1>
</tr>
</table>


</body>
</html>

