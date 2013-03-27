<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>本站公告</title>

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
		<table border="1px" width="250px">
			<tr>
				<td height="32">
					本站公告：
				</td>
			</tr>
			<tr>
				<td height="248">
					<marquee behavior=scroll direction=up width=100% height=118
						scrollamount=1 scrolldelay=60 onMouseOver='this.stop()'
						onMouseOut='this.start()'>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
						<a href="#" onclick="" title="">撒旦法撒旦法水电费</a>
						<br>
					</marquee>
				</td>
			</tr>
		</table>
	</body>
</html>
