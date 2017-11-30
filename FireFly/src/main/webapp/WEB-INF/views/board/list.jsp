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
		<div class="page-header text-center">
			<h2><i class="fa fa-telegram"></i>게시글목록</h2>
		</div>
		<table class="table table-striped table-hover">
			<tr>
				<th>No.</th>
				<th>TiTle</th>
				<th>Writer</th>
			</tr>
			<c:forEach var="board" items="${list}" >
				<tr>
					<td>${board.id}</td>
					<td><a href="view?boardId=${board.id}">
							${board.title} </a></td>
					<td>${board.writer}</td>
				</tr>
			</c:forEach>
		</table>

		<div class="text-center">
			<a href="create" class="btn btn-primary">
			<i class="fa fa-user-plus">추가</i>
			</a>
		</div>
	</div>
</body>
</html>
