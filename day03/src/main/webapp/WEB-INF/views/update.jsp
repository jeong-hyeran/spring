<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<h2>게시물 수정</h2>
<div id="update">
	<form method="POST">
	<table>
	<input type="hidden"  name="idx" value="${dto.idx}">
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="hidden" value="${dto.password }">
				<input type="password" name="password" placeholder="비밀번호 확인">
			</td>
			<td>제목</td>
			<td>
				<input type="text"  name="title" value="${dto.title }">
			</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>
				<input type="hidden"  name="writer" value="${dto.writer}">
				${dto.writer}
			</td>
			<td>날짜</td>
			<td>${dto.wdate}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3">
				<textarea type="text" name="content">
					${dto.content }
				</textarea>
			</td>
		</tr>
	</table>
	<p><input type="submit" value="수정완료"></p>
	</form>
	<ul>
		<li><a href="${cpath }/list"><button>목록</button></a></li>
	</ul>
</div>

</body>
</html>