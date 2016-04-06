<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
		<tr>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
			<td>123</td>
		</tr>
	</table>
	<form method="POST">
        用户名：<input type="text" name="number"><br>
        密码：<input type="password" name="pwd"><br>
        <button id="submit" class="btn btn-primary">提交</button>
    </form>
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <script>
        $("#submit").on('click', function() {
            $.ajax({
            	type:"POST",
                data: {
                    'adminBean.number': $("input[name='number']").val(),
                    'adminBean.pwd': $("input[name='pwd']").val()
                },
                dataType: 'json',
                url:'admin-test.action',
                success: function() {
                    console.log('123');
                }
            });
        })
    </script>
</body>
</html>