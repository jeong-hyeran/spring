<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>:::회원제 게시판:::</title>
<style>
table {
	border: 2px solid black;
	border-collapse: collapse;
	padding: 10px;
	width: 500px;
	margin: auto;
}

th {
	border: 1px solid black;
	padding: 10px;
	background-color: #eee;
}

td {
	border: 1px solid black;
	padding: 10px;
}

a {
	text-decoration: none;
	color: inherit;
}

a:hover {
	text-decoration: underline;
}

ul {
	margin: auto 10px;
	padding: 0 10px;
	display: flex;
	justify-content: space-around;
}

li {
	list-style: none;
	margin: 0;
	padding: 5px 10px;
}

#gu {
	text-align: right;
	font-size: 0.7em;
	line-height: 1.1em;
}

#main {
	width: 1000px;
	margin: 0 auto;
}

h3 {
	text-align: center;
}

header {
	margin: 10px 100px;
}
form{
	display: block;
	text-align: center;
}
input[name=title] {
	width: 355px;
}
input[type=submit] {
	align: left; 
}
#join, #login{
	margin:auto;
	width: 200px;
	background-color: #eee;
	padding: 20px;
	border-radius: 5px;
}
</style>
</head>
<body>
	<header>
		<h1><a href="${cpath }">Review</a></h1>
		
		<p align="right">
			<c:if test="${empty login }">
				<div id="gu">로그인이 필요합니다.</div>
			</c:if>
			<c:if test="${not empty login }">
				${login.userid } [${login.username }님]
			</c:if>
		</p>
		
		<ul>
			<c:if test="${not empty login }">
				<li><a href="${cpath }/account/logout">로그아웃</a></li>
			</c:if>
			
			<c:if test="${empty login }">
				<li><a href="${cpath }/account/login">로그인</a></li>
			</c:if>
			
				<li><a href="${cpath }/review/list">리뷰목록</a></li>
		</ul>
	</header>
	<hr>