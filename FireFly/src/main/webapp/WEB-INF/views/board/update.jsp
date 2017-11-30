<%@page import="javax.xml.ws.Response"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	
</script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h2>
				<i class="fa-pencil-square-o"></i>수정하기

			</h2>
		</div>
		<form method="post" action="update">
			<input type="hidden" name=id value="${board.id}">
			<table class="table">
				<tr>
					<th style="width: 150px">작성자</th>
					<td><input name="writer" value="${board.writer }"></td>
				</tr>
				<tr>
					<th>글 제목</th>
					<td><input type="text" name="title" value="${board.title }">
					</td>
				</tr>

				<tr>
					<th>글 내용</th>
					<td>
					<input style="height: 500px; width: 700px" type="text" name="content" value="${board.content }">
					</td>
				</tr>
			</table>
		
		<div class="text-center">
			<a class="btn btn-success" href="javascript:history.go(-1)"><i class="fa fa-ban" ></i>취소</a>
			<button class="btn btn-primary" type="submit">
				<i class="fa fa-check"></i>확인
			</button>
		</div>
		</form>
	</div>
</body>
</html>
