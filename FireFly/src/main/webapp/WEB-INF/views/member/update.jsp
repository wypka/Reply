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
				<i class="fa fa-search"></i>상세보기
			</h2>
		</div>
		<form method="post" action="update">
			<input type="hidden" name="userId" value="${member.userId }">
			<table class="table">
				<tr>
					<th style="width: 150px">UserId</th>
					<td>${member.userId }</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${member.name }">
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="password"
						value="${member.password }"></td>
				</tr>
				<tr>
					<th>email</th>
					<td><input type="text" name="email" value="${member.email }">
					</td>
				</tr>
			</table>
		
		<div class="text-center">
			<a class="btn btn-success" href="view?userId=${member.userId }"><i
				class="fa fa-search">상세보기</i></a>
			<button class="btn btn-primary" type="submit">
				<i class="fa fa-check"></i>확인
			</button>
		</div>
		</form>
	</div>
</body>
</html>
