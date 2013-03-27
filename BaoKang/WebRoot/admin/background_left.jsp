<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'background_left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	<table width="200px" border="1" height="600">

			<tr>
				<td>
					<a href="#">科室管理：</a>
				</td>
			</tr>
			<tr>
				<td height="97">
					<p>
						<a href="#">添加科室</a>
					</p>
					<p>
						<a href="#">修改科室</a>
					</p>
					<p>
						<a href="#">删除科室</a>
					</p>
				</td>
			</tr>
			<tr>
				<td>
					<a href="#">科室管理：</a>
				</td>
			</tr>

			<tr>
				<td>
					<a href="#">科室管理：</a>
				</td>
			</tr>
			<tr>
				<td>
					<a href="#">科室管理：</a>
				</td>
			</tr>
			<tr>
				<td>
					<a href="#">科室管理：</a>
				</td>
			</tr>
			<tr>
				<td height="41">
					<a href="#">科室管理：</a>
				</td>
			</tr>
		</table>
  </body>
</html>
