<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<div class="main">
	<div>${dto.movietag }</div>
	<div>
		 <h3>${dto.title }</h3>
		 <h3>${dto.channel } | 조회수 : ${dto.viewcount }</h3>
	</div>
<p align="right">
	<button id="deleteBtn">삭제</button>
</p>
</div>

<script>
	const deleteBtn = document.getElementById('deleteBtn')
	
	function deleteHandler(){
		const idx = '${dto.idx}'
		const flag = confirm('정말 삭제하시겠습니까')
		if(idx != '' && flag){
			location.href = '${cpath}/delete/'+ idx
		}
	}
	deleteBtn.addEventListener('click',deleteHandler)
</script>

</body>
</html>