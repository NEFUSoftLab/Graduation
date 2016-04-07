<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<table>
		${teacherBean }
		<c:forEach var="item" items="${teacherBean}" >
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