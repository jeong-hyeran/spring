<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<div id="main">
<h3>리뷰 작성</h3>
<c:if test="${empty login }">
	<c:redirect url="/account/login"/>
</c:if>

<form method="POST" enctype="multipart/form-data">
<p><input type="text" name="title" placeholder="제목을 입력하세요" required autofocus></p>
<p><textarea cols="50" rows="20" name="content" placeholder="내용을 입력하세요" required></textarea></p>
<p><input type="file" name="uploadFile" required></p>
<p><input type="submit" value="작성"></p>
</form>

</div>
</body>
</html>