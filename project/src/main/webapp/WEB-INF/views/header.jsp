<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>project</title>
<style>
table {
	border: 1px solid black;
	border-collapse: collapse;
}

th {
	border: 1px solid black;
	padding: 10px;
	text-align: center;
	background-color: #eee;
}

td {
	border: 1px solid black;
	padding: 10px;
}

pre {
	font-size: 16px;
	font-family: inherit;
}
</style>
</head>
<body>

	<h1><a href="${cpath }">project</a></h1>
	
	<p align="right">${login.username }</p>
	<c:set var="loginLink" value="${empty login ? 'login' : 'logout' }" />
	<c:set var="loginMenu" value="${empty login ? '로그인' : '로그아웃' }" />
	<ul>
		<li><a href="${cpath }/member/${loginLink}">${loginMenu}</a></li>
		<li><a href="${cpath }/member/join">회원가입</a></li>
		<li><a href="${cpath }/member/list">회원목록</a></li>
		<li><a href="${cpath }/member/view">회원정보</a></li>
		<li><a href="${cpath }/music/list">음원목록</a></li>
	</ul>

	<hr>