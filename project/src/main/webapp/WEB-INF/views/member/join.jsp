<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<h3>회원가입</h3>

<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="userid" placeholder="ID"></p>
	<p><input type="password" name="userpw" placeholder="Password"></p>
	<p><input type="text" name="username" placeholder="Name"></p>
	<p><input type="email" name="email" placeholder="email"></p>
	<p>프로필 <input type="file" name="upload" ></p>
	<p><input type="submit" value="회원가입"></p>
</form>

</body>
</html>