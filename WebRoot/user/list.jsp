<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	
	<h1>用户列表</h1>
	<a href="/user/form">添加用户</a>
	<table>
		<thead>
			<th>ID</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>备注</th>
		</thead>
		<tbody>
			<c:forEach items="${users }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.name }</td>
					<td>${user.age }</td>
					<td>${user.sex }</td>
					<td>${user.remark }</td>
					<td><a href="/user/edit/${user.id }">修改</a>&nbsp;&nbsp;<a href="/user/del/${user.id }">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>