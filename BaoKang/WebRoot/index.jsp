<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>«∞Ã®œ‘ æ</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
	<link rel="stylesheet" type="text/css" href="css/front.css">
	

		<style type="text/css">

</style>
	</head>

	<body>

		<div class="wrapper">
			<div class="header">
				<jsp:include page="public/head.jsp" flush="false" /></div>
			<div class="container">
				<div class="cont_left">
					<jsp:include page="public/front_left.jsp" flush="false" /></div>
				<div class="cont_right_cont">
					<div class="login">
						<jsp:include page="public/front_login.jsp" flush="false" /></div>
					<div class="puNotice">
						<jsp:include page="public/puNotice.jsp" flush="false" /></div>
						<div class="hotPro">
						<jsp:include page="public/hot_pro.jsp" flush="false" /></div>
				</div>				
			</div>
			<div>
				<jsp:include page="public/foot.jsp" flush="false"/>
				</div>
		</div>

	</body>
</html>
