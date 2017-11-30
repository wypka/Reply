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
		<table class="table">
			<tr>
				<th style="width: 150px">작성자</th>
				<td>${board.writer }</td>

			</tr>
			<tr>
				<th style="width: 150px">글 제목</th>
				<td>${board.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td style="height: 500px; width: 700px">${board.content }</td>
			</tr>
		</table>
		<div class="text-center">
			<a class="btn btn-primary" href="javascript:history.go(-1)"> <i
				class="fa fa-list">목록</i></a> <a class="btn btn-success"
				href="update?boardId=${board.id}"><i
				class="fas fa-pencil-square">수정</i></a> <a class="btn btn-warning"
				href="delete?id=${board.id}"><i class="fa fa-trash-o">삭제</i></a>
		</div>
		<form action="reply/create" method="post">
			<input type="hidden" name="replyId" value="${reply.replyId }">
			<input type="hidden" name="boardId" value="${reply.boardId }">
			<input type="hidden" name="reRef" value=0> 
			<input type="hidden" name="reDepth" value=0> 
			<input type="hidden" name="reSeq" value=0>
			<table class="table">
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" value="${reply.writer }"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><input type="text" name="content"></td>
				</tr>
			</table>
			<div class="text-center">
				<a class="btn btn-success" href="javascript:history.go(-1)"><i
					class="fa fa-ban"></i>취소</a>
				<button class="btn btn-primary" type="submit">
					<i class="fa fa-check"></i>확인
				</button>
			</div>
		</form>
		<table class="table">
			<tbody>
				<c:forEach var="reply" items="${list}">
					<tr>
						<td><c:forEach begin="1" end="${reply.reDepth }">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach></td>
						<th>${reply.writer}</th>
						<th>${reply.content}</th>
					</tr>
					<tr>
						<td><c:forEach begin="1" end="${reply.reDepth }">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach></td>
						<th><a
							href="reply/reReply?reRef=${reply.reRef }reDepth=${reply.reDepth }&boardId=${board.boardId}"
							class="btn btn-primary">[댓글]</a></th>
						<th><a
							href="reply/reUpdate?reRef=${reply.reRef }reDepth=${reply.reDepth }&boardId=${board.boardId}"
							class="btn btn-success">[수정]</a></th>
						<th><a
							href="reply/reDelete?reRef=${reply.reRef }reDepth=${reply.reDepth }&boardId=${board.boardId}"
							class="btn btn-warning">[삭제]</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
