<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
</head>
<body>
<h1> Our First jsp </h1>
<%
List<String>list=new ArrayList<>();
list.add("vineel");
list.add("rudrapati");
list.add("vineel");
list.add("rudrapati");
list.add("vineel");
list.add("rudrapati");
for(String name:list)
{
out.println(name+"<br>");
}
%>
<%
for( int i=0; i<10;i++){
out.println("i="+i+" <br>");
}
%>
</body>
</html>


