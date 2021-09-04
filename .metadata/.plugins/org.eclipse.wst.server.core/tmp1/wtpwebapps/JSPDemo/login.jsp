<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow;">

<h1>This is my 1st JSP</h1>
<h2>JSP is dynamic compilation, just refresh the brower</h2>

<%
int a= 10;
int b=20;
int c= a+b;
out.print("Result = "+c+"<br>");

for(int i=0;i<=5;i++)
{
   out.print("value of i ="+i+"<br>");	
}
%>

<hr>

<form action="login.jsp">
<input type="text" name="u" placeholder="username">
<input type="password" name="p" placeholder="password">
<input type="submit" value="LOGIN">
</form>

<hr>

</body>
</html>
