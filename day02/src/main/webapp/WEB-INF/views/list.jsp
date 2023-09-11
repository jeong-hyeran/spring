<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<div class="main">
			<div class="wrap">
	<c:forEach var="dto" items="${list }">
		<div class="item">
				<div class="thumbnail" style="background-image: url('${dto.thumbnail}')">
	<%-- 				<a href="${cpath }/view?idx=${dto.idx}"></a> --%>
	<%-- 아래 처럼 쿼리스트링을 안쓰고도 파라미터를 넘길 수 있다 --%>
					<a href="${cpath }/view/${dto.idx}"></a>
				</div>
				<div>
					<h4>
						<c:if test="${fn:length(dto.title) > 30}">
							${fn:substring(dto.title,0, 30)	}...
						</c:if>  
						<c:if test="${fn:length(dto.title) <= 30}">
							${dto.title }  
						</c:if>  
						| 
						${dto.channel }
					</h4>
				</div>
		</div>
	</c:forEach>
			</div>
</div>

</body>
</html>