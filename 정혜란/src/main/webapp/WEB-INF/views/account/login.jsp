<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<div id="main">
<h3>로그인</h3>
<div id="login">
<form method="POST">
	<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
	<p><input type="password" name="userpw" placeholder="Password" required></p>
	<p><input type="submit" value="로그인"></p>
</form>
<hr>
<p align="center"><a href="${cpath }/account/join"><button>회원가입</button></a></p>
</div>
</div>
</body>
</html>