<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/WEB-INF/static/assets/js/jquery-3.5.1.js"></script>
</head>
<body>
    <script>
        function onSubmit() {
            $("#id2").val("dafs");
        }
    </script>
    <h1>This is index jsp ${m}</h1>
    <div id="id"></div>
    <%=request.getContextPath()%>
    <%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"%>
    <%=request.getSession().getServletContext().getRealPath("/")%>
    ${pageContext.request.contextPath}
    <input type="text" id="id2">
    <form onclick="onSubmit()" >
        username:<input type="text" name="username">
        password:<input type="password" name="password">
        <input type="submit" onclick="onSubmit()"/>
    </form>

</body>
</html>
