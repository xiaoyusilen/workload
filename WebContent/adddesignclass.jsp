<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>计算课程设计工作量</title>
<style type="text/css"> 
body{
	background-image:url(img/1.jpg);
	background-repeat:x;
	margin-top: 150px;
} 
body h1{text-align:center;} 
body,td,th {}
	table.gridtable
	{
		font-family:verdana,arial,sans-serif;
		font-size:20px;
		color:#333333;
		border-width:1px;
		border-color:#666666;
		border-collapse:collapse;
	}
	table.gridtable th
	{
		border-width:1px;
		padding:8px;
		border-style:solid;
		border-color:#666666;
		background-color:#dedede;
	}
	table.gridtable td
	{
		border-width:1px;
		padding:8px;
		border-style:solid;
		border-color:#666666;
		background-color:#ffffff;
	}
</style>
</head>
<body>
<center>
<table class="gridtable" width="400px">
	<form name="classdes" action="ClassDesCulServlet" method="post" onsubmit="return validate(this);">
		<tr>
			<th colspan="2">计算课程设计工作量</th>
		</tr>
		<tr>
			<td>请输入上课人数</td>
			<td><input type="text" name="student"></td>
		</tr>
		<tr>
			<td>请输入上课周数</td>
			<td><input type="text" name="week"></td>
		</tr>
		<tr>	
			<td colspan="2">
				<center><input style="font-size:20px;" type="submit" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input style="font-size:20px;" type="reset" value="重置"></center></form>
			</td>
		</tr>
	</table><br><br>
	<button style="font-size:20px;" onclick="javascript:window.location.href='homepage.jsp';">返回首页</button>
	</center><br><br>
<script type="text/javascript">
		function validate(classdes) {
			if (classdes.student.value == "") {
				alert("对不起，上课人数不能为空！");
				return false;
			}
			if (classdes.week.value == "") {
				alert("对不起，上课周数不能为空！");
				return false;
			}
			return true;
		}
</script>
    <style>
        .text { height: 18px;font-size:18px; }
    </style>
    <script language="javascript">
        var objs = document.getElementsByTagName("input") ;
        for (var i = 0; i < 100; i ++) {
            if (objs[i].type == "text"){
                objs[i].className = "text" ;
            }
        }
    </script>
</body>
</html>