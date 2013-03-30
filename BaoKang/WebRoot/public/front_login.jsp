<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <script type="text/javascript">function to(){ window.localtion.href="register.jsp";}</script> 
  </head>
  
  <body>
   <form action="user/CommerUserLogin" method="post"> 
<table width="250px" border="1">
      <tr>
        <td colspan="3">&nbsp;</td>
        </tr>
      <tr>
        <td width="37%">用户名：</td>
        <td width="63%" colspan="2">
          <input type="text" name="commerUser.name" />
        </td>
        </tr>
      <tr>
        <td>&nbsp;密 码：</td>
        <td colspan="2"> <input type="text" name="commerUser.password" /></td>
        </tr>
      <tr>
        <td>&nbsp; 类别：</td>
        <td colspan="2"> 
        <select name="userType" width="350px">
         <option value="commerUser" selected>普通用户</option>
          <option value="doctor">医生</option>
           <option value="admin" >管理员</option>
           <option value="lead" >领导</option>
        </td>
        </tr>
      <tr>
        <td height="43" colspan="3" align="center" nowrap="nowrap">
          <input type="submit" name="login" id="login" value="登陆" />
          &nbsp;
     <!--  <a href="regist.html">-->
       <input type="button" name="register" id="register" value="注册" Onclick=" window.location.href='http://localhost:8088/BaoKang/public/register.jsp'"/>
    
          &nbsp;  
            
              <input type="submit" name="findPassword" id="findPassword" value="忘记密码" />
       </td>
        </tr>
        
    </table>

  </body>
</html>
