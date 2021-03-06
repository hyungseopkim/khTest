<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
* {
	box-sizing: border-box;
	margin: 0;
}

body {
	background-image:
		url("${pageContext.request.contextPath}/resources/beuyoyeon-hadan-a02-02.jpg");
}

header {
	background-color: rgba(241, 241, 241, 0.7);
	padding: 30px;
	text-align: center;
	font-size: 35px;
}

section {
	width: 1000px;
	margin: 0 auto;
	padding: 50px;
}

article {
	text-align: center;
}

table {
	width: 100%;
}

a {
	text-decoration: none;
}

tr:hover{
	background-color: #e9e9e9
}

div{
	text-align: center;
}
</style>
</head>
<body>
	<header> 안녕하세요 여러분 게시판입니다. </header>
	<section> <article>
	<table>
		<tr>
			<th>제목</th>
			<th>작성자</th>
			<th>작성시간</th>
		</tr>
		<c:forEach var="result" items="${list}">
			<tr>
				<td><a href="readArticle.do?seq=${result.seq}">${result.title}</a></td>
				<td><a href="readArticle.do?seq=${result.seq}">${result.writer}</a></td>
				<td>${result.writedate}</td>
			</tr>
		</c:forEach>
	</table>
	</article> </section>
	<div><button id="back">뒤로가기</button></div>
	<script>
		document.getElementById("back").onclick = function(){
			location.href = "index.do";
		}
	</script>
</body>
</html>