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

  </head>
  
  <body>
    
<table width="250px" border="1">
      <tr>
        <td colspan="3">&nbsp;</td>
        </tr>
      <tr>
        <td width="37%">用户名：</td>
        <td width="63%" colspan="2">
          <input type="text" name="textbook" id="name" />
        </td>
        </tr>
      <tr>
        <td>密&nbsp;&nbsp;&nbsp; 码：</td>
        <td colspan="2"> <input type="text" name="textbook" id="password" /></td>
        </tr>
      <tr>
        <td>验证码：</td>
        <td colspan="2"> 
        <input type="text" name="textbook" id="VerificationCode" /> 
        </td>
        </tr>
      <tr>
        <td height="43" colspan="3" align="center" nowrap="nowrap">
          <input type="submit" name="login" id="login" value="登陆" />
          &nbsp;
     <!--  <a href="regist.html">-->
         <input type="submit" name="register" id="register" value="注册" onclick="window.location.href='regist.html'"/>
    
          &nbsp;  
            
              <input type="submit" name="findPassword" id="findPassword" value="忘记密码" />
       </td>
        </tr>
        
    </table>

  </body>
</html>
