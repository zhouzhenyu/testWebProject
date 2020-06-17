<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/static/assets/js/jquery-3.5.1.js"></script>
</head>
<body>
    <script>
        function onSubmit() {
            $.ajax({
                url:"http://localhost:8080/testweb/login",
                data:{username:"aaaa",password:"bbbb"},
                type:"POST",
                dataType:"json",
                success:function (res) {
                    if(res){
                        alert("dafsfs");
                    }
                }
            });
        }

        function click1() {
            $("#id2").val("dafs");
            $.ajax({
                url:"http://localhost:8080/testweb/login/query",
                data:{username:"aaaa",password:"bbbb"},
                type:"POST",
                dataType:"text",
                success:function (data) {
                    if(data){
                        alert("dafsfs");
                    }
                },
                error:function (data) {
                    if(data){
                        alert(data);
                    }
                }
            });
        }
    </script>
    <h1>This is index jsp ${m}</h1>
    <div id="id"></div>
<%--    <%=request.getContextPath()%>--%>
    <%--    <%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"%>--%>
    <%--    <%=request.getSession().getServletContext().getRealPath("/")%>--%>
    <%--    ${pageContext.request.contextPath}--%>
    <input type="text" id="id2">
    <form>
        username:<input type="text" name="username">
        password:<input type="password" name="password">
        <input type="button" onclick="click1()" value="按钮"/>
        <input type="submit" onclick="onSubmit()"/>
    </form>
    <div>
<%--        <c:forEach var="${m}" items="customer">--%>
<%--            ID:${customer.id}--%>
<%--            name:${customer.name}--%>
<%--        </c:forEach>--%>
        <c:if test="${m != null}">
            dsfaag
        </c:if>
    </div>

</body>
</html>
