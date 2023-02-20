<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> page - 지시어 erorPage/isErrorPage 속성</title>
</head>
<body>

<h2> 서비스중 일시적인 오류 발생함.</h2>
<p>
	오루명: <%= exception.getClass().getName() %> <br />
	오류 메세지: <%= exception.getMessage() %>
	</p>

</body>
</html>