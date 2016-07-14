<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教学工作量计算系统</title>
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
	double m=(Double)session.getAttribute("m");
%>
<center><font color="#ffffff" face="微软雅黑"><h1>教学工作量计算系统</h1></font>
<br>
<br>
<button style="height:50px;width:170px;font-size:20px;" onclick="javascript:window.location.href='addclass.jsp';">课程教学</button>
&nbsp;
<button style="height:50px;width:170px;font-size:20px;" onclick="javascript:window.location.href='adddesignclass.jsp';">课程设计</button>
<br>
<br>
<button style="height:50px;width:170px;font-size:20px;" onclick="javascript:window.location.href='addpractice.jsp';">毕业实习</button>
&nbsp;
<button style="height:50px;width:170px;font-size:20px;" onclick="javascript:window.location.href='addgraduationproject.jsp';">毕业设计</button>
<br>
<br>
<font color="#ffffff"><h3>当前计算结果为：<font color="ff0000"><%out.print((double)((int)(m*100))/100);%></font></h3></font>
<br>
<button style="height:50px;width:170px;font-size:20px;" onclick="javascript:window.location.href='cancel.jsp';">清空当前数据</button>
</center>
</body>
</html>