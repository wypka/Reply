<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form"%>

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
		<table class="table">
			<tr>
				<th style="width: 150px">UserId</th>
				<td>${member.userId }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${member.name }</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>${member.password }</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>${member.date }</td>
			</tr>
			<tr>
				<th>email</th>
				<td>${member.email }</td>
			</tr>
		</table>
		<div class="text-center">
			<a class="btn btn-primary" href="list"><i class="fa fa-list">목록</i></a>
			<a class="btn btn-success" href="update?userId=${member.userId }"><i
				class="fa fa-pencil-square">수정</i></a> 
			<a class="btn btn-warning"
				href="delete?userId=${member.userId }"><i class="fa fa-trash-o">삭제</i></a>
		</div>
	</div>
</body>
</html>
