<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<div id="main">
<h3>리뷰 목록</h3>
<table>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:if test="${empty list }">
	<tr>
		<td style="text-align: center;" colspan="4">
			작성된 리뷰가 없습니다.
		</td>
	</tr>
	</c:if>
	<c:if test="${not empty list }">
<c:forEach var="dto" items="${list}">
<tr>
	<td>${dto.idx }</td>
	<td>
	<c:if test="${not empty dto.filename }">
		💾
	</c:if>
		<a href="${cpath }/review/view/${dto.idx}">${dto.title }</a>
	</td>
	<td>${dto.writer }</td>
	<td>${dto.wdate }</td>
</tr>
</c:forEach>
</c:if>
</table>

<ul>
	<li><a href="${cpath }/review/write"><button>리뷰작성</button></a></li>
</ul>

</div>
</body>
</html>