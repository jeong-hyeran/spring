<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h2>게시물 작성</h2>

<div id="add">
<form method="POST">
	<p><input type="password" name="password" placeholder="작성비밀번호"></p>
	<p><input type="text" name="title" placeholder="제목"></p>
	<p><input type="text" name="writer" placeholder="작성자"></p>
	<p><textarea type="text" name="content" placeholder="내용"></textarea></p>
	<p><input type="submit" value="작성완료"></p>
</form>
</div>



</body>
</html>