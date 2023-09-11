<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<h2>검색 목록</h2>
<div id="list">
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="list" items="${list }">
			<tr>
				<td>${list.idx }</td>
				<td><a href="${cpath }/view/${list.idx}">${list.title }</a></td>
				<td>${list.writer }</td>
				<td>${list.wdate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<ul>
		<li><a href="${cpath }/list"><button>목록</button></a></li>
	</ul>

</div>
</body>
</html>