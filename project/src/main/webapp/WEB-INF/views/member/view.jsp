<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<h3>마이페이지</h3>
	<ul>
		  <li>${login.userid }</li>
		  <li>${login.username }</li>
		  <li>${login.email }</li>
		  <li>
		  	 <img src="${cpath }/project/${login.profileImg}"> 
		  </li>
	</ul>

</body>
</html>