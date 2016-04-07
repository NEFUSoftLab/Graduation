<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<table>
		<c:forEach var="item" items="${getAllStudent }" >
			<tr>
				<td>${item.number }</td>
				<td>${item.pwd }</td>
				<td>${item.name }</td>
				</tr>
				
		</c:forEach>
	</table>
	<form method="POST">
        用户名：<input type="text" name="number"><br>
        密码：<input type="password" name="pwd"><br>
        <button id="submit" class="btn btn-primary">提交</button>
    </form>
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
                    document.
                }
            });
        })
    </script>