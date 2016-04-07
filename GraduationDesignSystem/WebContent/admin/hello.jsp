<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %>  
	<table>
		<c:forEach var="item" items="${teacherBean }">
			<tr>
				<td>${item.name }</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<br>
	<br>
	<br>
	<br>
	
	<br>
	<br>
	
	<form method="POST">
        用户名：<input type="text" name="number"><br>
        密码：<input type="password" name="pwd"><br>
        <button id="submit" class="btn btn-primary">提交</button>
    </form>