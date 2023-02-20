<%@ page import = "Utils.JSFunction" %>

<% 
if( session.getAttribute ("UserId") == null) {
JSFunction.alertLocation("로그인 후 이용해주세요.",
		"../06Session/LoginForm.jsp", out);
return;
}

%>
