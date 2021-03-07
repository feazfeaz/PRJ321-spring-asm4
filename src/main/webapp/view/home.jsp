<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login tạm bợ</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/reuse-component/css/login.css" />
</head>
<body>

	<form class="box" action="${pageContext.request.contextPath}/login" method="post">
		<h1>login</h1>
		<input type="text" name="username" id="" placeholder="Username">
		<input type="password" name="password" id="" placeholder="Password">
		<h6 class="relogin">${error}</h6>
		<input type="submit" value="Logjn">
	</form>

</body>
</html>