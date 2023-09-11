<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비회원 게시판</title>
<style>
	table {
		border: 1px solid black;
		border-collapse: collapse;
		padding: 10px;
	}
	th,td{
		border: 1px solid black;
		padding: 10px;
	}
	a{
		text-decoration: none;
		color: inherit;
	}
	ul{
		list-style: none;
		margin: 0;
		padding:0;
		display: flex;
	}
	li{
		padding: 5px 10px; 
		margin: 5px 10px;
	}
</style>
</head>
<body>



<header>
	<h1><a href="${cpath }">비회원 게시판</a></h1>
	<nav>
		<ul>
			<li><a href="${cpath }/list">목록</a></li>
			<li><a href="${cpath }/add">글작성</a></li>
		</ul>
	</nav>
	<hr>
</header>