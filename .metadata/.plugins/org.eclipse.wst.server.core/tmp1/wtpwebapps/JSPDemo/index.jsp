<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%!
    int a=10;
int b=100; 
    
    int add(int a,int b)
    {
    	return a+b;
    	
    }

%>


<%
    String username = request.getParameter("u");
    String password = request.getParameter("p");
    
    out.println("Username = "+username+"<br>");
    out.println("Password = "+password+"<br>");

    out.println("value of a ="+a+"<br>");
    out.println(add(2,4));
%>

<%=add(4,5) %>
<%=a %>

<%= "Result of add = "+add(4,6)+" value of a = "+a+" value of b ="+b %>

<%--
int a=10;
  out.println(a);

 --%>


</body>
</html>