<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>

	<iframe width="400" height="367" src="https://www.youtube.com/embed/7nSMct55dpA" title="Chore Haryana Aale | Shooting Time | @Ankitbaiyanpuria @ElvishYadavVlogs #haryanviswag" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
</body>
</html>