<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>头部</title>
    
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
    
<table width="1008" border="0" align="center" height="108px">
  <tr>
    <td height="120px" background="images/top_bg.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td height="10px" colspan="2" align="left" valign="bottom" background="images/top_bg.jpg">
   <a href="http://localhost:8088/BaoKang/index.jsp"> <font color="#FFFFFF">首页</font> </a> &nbsp; |&nbsp; &nbsp;<a href="http://localhost:8088/BaoKang/public/hospital_info.jsp"> <font color="#FFFFFF">医院介绍</font></a> &nbsp; |&nbsp; <a href="http://localhost:8088/BaoKang/public/office_info.jsp"> <font color="#FFFFFF">科室介绍</font></a> |&nbsp; &nbsp;<a href="http://localhost:8088/BaoKang/commerUser/online_ask.jsp"> <font color="#FFFFFF">在线问答</font></a> |&nbsp; &nbsp;<a href="http://localhost:8088/BaoKang/commerUser/online_order.jsp"> <font color="#FFFFFF">在线预约</font></a> |&nbsp; &nbsp;<a href="http://localhost:8088/BaoKang/commerUser/user_info.jsp"> <font color="#FFFFFF">个人信息管理</font></a> |&nbsp; &nbsp;
  </td>
  </td>
  </td>
  </td>
  </tr>
  <tr>
    <td height="5">&nbsp;</td>
  </tr>
</table>

  </body>
</html>
