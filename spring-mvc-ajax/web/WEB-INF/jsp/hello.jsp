<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--加载Jquery--%>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<script>
    function x() {
        $.post({
            url:"${pageContext.request.contextPath}/t",
            data:{"name":$("name").val()},
            success:function (data){
                console.log(data);
            }
        })
    }
    function y() {
        $.post({
            url:"${pageContext.request.contextPath}/t",
            data:{"pwd":$("pwd").val()},
            success:function (data){
                console.log(data);
            }
        })
    }

</script>
<body>
用户名：<input type="text" id="name" onblur="x()">
<span id="spanN"></span>
密码：<input type="text" id="pwd" onblur="y()">
<span id="spanP"></span>
</body>
</html>
