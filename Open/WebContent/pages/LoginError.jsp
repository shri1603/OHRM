<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginError</title>
<link rel="stylesheet" type="text/css" href="Login.css">
</head>
<body>

        <h1><center><font color="BLUE">LOGIN PAGE</font></center> </h1>
        <form method="POST" action="${pageContext.request.contextPath}/loginServlet">

            <table border="0" align="center">
                <thead>
                    <tr>
                        <th>User Name</th>
                        <th><input type="text" name="uname" value="" /></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>
             <h1>Please Enter the Correct Credentials</h1>
        </form>
    
</body>
</html>