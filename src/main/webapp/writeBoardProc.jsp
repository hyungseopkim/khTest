<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${result>0 }">
			<script>
				alert("게시물 등록성공!");
				location.href="index.do";			
			</script>		
		</c:when>
		<c:otherwise>
			<script>
				alert("게시물 등록브베!");
				location.href="index.do";			
			</script>	
		</c:otherwise>
	
	
	</c:choose>
</body>
</html>