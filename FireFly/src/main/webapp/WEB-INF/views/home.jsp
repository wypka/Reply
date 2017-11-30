<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
</script>

<body>
<h1>
	메인홈 입니다.
</h1>
<div class= "container">
	<table class="table table-striped table-hover">
		<tr class="text-center">
			<th class="btn btn-success"><H2><a href="board/list"><i ckass="fa fa-folder">게시판 가기</i></a></H2></th>
			<th class="btn btn-primary"><H2><a href="member/list"><i class="fa fa-address-book">회원관리</i></a></H2></th>
		</tr>
	</table>
</div>


<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
