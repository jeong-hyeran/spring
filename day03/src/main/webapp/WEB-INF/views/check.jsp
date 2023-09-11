<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<script>
	const row = '${row}'
	if(row != 0){
		alert('완료 되었습니다.')
		location.href='${cpath}/list'
	}else{
		alert('비밀번호가 일치하지 않습니다.')
		history.go(-1)
	}
</script>

</body>
</html>