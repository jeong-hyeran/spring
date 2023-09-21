<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<div id="main">
<h3>단일 조회</h3>
<table>
<tr>
	<td>제목</td>
	<td colspan="3">${dto.title }</td>
</tr>
<tr>
	<td>작성자</td>
	<td>${dto.writer}</td>
	<td>날짜</td>
	<td>${dto.wdate}</td>
</tr>
<tr>
	<td>내용</td>
	<td colspan="3">${dto.content }</td>
</tr>
<tr>
	<td>첨부파일</td>
	<td colspan="3">
		<img src="${cpath }/upload/${dto.filename }">
	</td>
</tr>
</table>

<ul>
	<li><a href="${cpath }/review/list"><button>목록</button></a></li>
	<c:if test="${login.username eq dto.writer }">
		<li><a href="${cpath }/review/delete/${dto.idx}"><button>삭제</button></a></li>
	</c:if>
	<li><a href="${cpath }/review/write"><button>리뷰 작성</button></a></li>
</ul>

</div>
</body>
</html>