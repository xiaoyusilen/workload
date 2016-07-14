<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css"> 
body{
	background-image:url(img/1.jpg);
	background-repeat:x;
	margin-top: 150px;
} 
</style>
</head>
<body>
<%
	session.invalidate();
	out.print("<script>window.parent.location.href='main.jsp'</script>");
%>

</body>
</html>