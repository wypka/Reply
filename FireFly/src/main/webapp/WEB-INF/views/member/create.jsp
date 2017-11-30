<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="ko">
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
	$(document).ready(function(){
		$('#idcheck').click(function(event){
			event.preventDefault();
			var userId = $('#userId').val();
			$.get('idcheck?userId='+userId,
					function(data,status){
				if(data ==true){
					$('#submit').prop('disabled',false);
				}
			});
			
		});
		$('#submit').prop('disabled',true);
	});
</script>
<style type="text/css">
.error{
	color : red;
	font-weight: 700;
}
</style>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h2>
				<i class="fa fa-search"></i>상세보기
			</h2>
		</div>
		<form:form commandName="member">
			<table class="table">
				<tr>
					<th style="width: 150px">UserId</th>
					<td><form:input path="userId"/>
						<form:errors cssClass="error" path="userId" />
						<button class="btn btn-primary">ID중복체크</button></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><form:input path="name"/>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password"
						value="${member.password }"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="password2"
						value="${member.password }"></td>
				</tr>
				<tr>
					<th>email</th>
					<td><input type="text" name="email" value="${member.email }">
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="text" name="date" value="<fmt:formatDate value="${member.date}" pattern="yyyy-mm-dd"/>" placeholder="yyyy-mm-dd형식으로 입력하세요">
					</td>
				</tr>
			</table>

			<div class="text-center">
				<a class="btn btn-success" href="view?userId=${member.userId }"><i
					class="fa fa-search">상세보기</i></a>
				<button id="submit" class="btn btn-primary" type="submit">
					<i class="fa fa-check"></i>확인
				</button>
			</div>
		</form:form>
	</div>
</body>
</html>
