<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<h2>게시물 보기</h2>
<div id="view">
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
	</table>
	
	<ul>
		<li><a href="${cpath }/list"><button>목록</button></a></li>
		<li><a href="${cpath }/update/${dto.idx}"><button>수정</button></a></li>
		<li><a href="${cpath }/delete/${dto.idx}"><button>삭제</button></a></li>
	</ul>
</div>

</body>
</html>