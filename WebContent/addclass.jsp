<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>计算课程教学工作量</title>
<style>
select{
font-size:20px;
}
</style>
<style type="text/css"> 
body{
	background-image:url(img/1.jpg);
	background-repeat:x;
	margin-top: 150px;
	font-size:20px;
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
  <script>
		function _change(obj){
			if(obj.value == '重复')
				document.getElementById("othertxt").disabled=false;
			else 
				document.getElementById("othertxt").disabled=true;
		}
  </script>
</head>
<body>
<center>
<table class="gridtable" width="780px">
	<form name="classcal" action="ClassCalServlet" method="post" onsubmit="return validate(this);">
		<tr>
			<th colspan="2">计算课程教学工作量</th>
		</tr>
		<tr>
			<td>请选择课程类别</td>
			<td>
				<select style="font-size:20;" name="ctype">
					<option value="null">请选择课程类别</option>
					<option value="理工类基础课">理工类基础课</option>
					<option value="理工类专业课">理工类专业课、专业基础课、经管类专业理工类课程</option>
					<option value="社科类">社科类、经管类、艺术类专业课</option>
					<option value="思政课">思政课</option>
					<option value="外语专业课">外语专业课</option>
					<option value="公共外语">公共外语</option>
					<option value="外语听力课">外语听力课</option>
					<option value="体育课">体育课</option>
					<option value="公共任选课">公共任选课</option>
					<option value="美术类">美术类讲课</option>
					<option value="实验课">实验课主持、指导（含计算机硬件实验课）</option>
					<option value="计算机上机">计算机上机主持、指导</option>
					<option value="艺术类">艺术类设计课（按每周16学时计）</option>
					<option value="建筑类">建筑类设计课（集中上课按每周7学时计）</option>	
				</select>
			</td>
		</tr>
		<tr>
			<td>请输入课程总学时</td>
			<td><input type="text" name="sum"></td>
		</tr>
		<tr>
			<td>请输入上课人数</td>
			<td><input type="text" name="student"></td>
		</tr>
		<tr>
			<td>该课程是否有重复班</td>
			<td><input type="radio" name="crep" onclick="_change(this);" value="重复"/> 
			是&nbsp;
			<input type="radio" name="crep" onclick="_change(this);" value="否" checked/>
			否&nbsp;&nbsp;
			</td>
		</tr>
		<tr>
			<td>请输入重复班人数</td>
			<td>
			<input type="text" name="restu" id="othertxt" disabled/>
			</td>
		</tr>
		<tr>
			<td>该课程是否为新开课程</td>
			<td><input type="radio" name="newclass" value="新">
			是&nbsp;
			<input type="radio" name="newclass" value="旧" checked>
			否
			</td>
		</tr>
		<tr>	
			<td colspan="2">
				<center><input style="font-size:20px;" type="submit" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input style="font-size:20px;" type="reset" value="重置"></center></form>
			</td>
		</tr>
	</table>
	<br>
	<br>
	<button style="font-size:20px;" onclick="javascript:window.location.href='homepage.jsp';">返回首页</button>
	</center><br><br>
<script type="text/javascript">
		function validate(classcal) {
			if (classcal.ctype.value == "null") {
				alert("对不起，课程类型不能为空！");
				return false;
			}
			if (classcal.sum.value == "") {
				alert("对不起，总学时不能为空！");
				return false;
			}
			if (classcal.student.value == "") {
				alert("对不起，人数不能为空！");
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