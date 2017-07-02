<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户表单</title>
</head>
<body>
	<form action="${user == null ? '/user/submit' : '/user/update' }" method="post">
		<input type="hidden" name="user.id" value="${user.id }" />
		<div>
			<label>姓名</label>
			<input name="user.name" value="${user.name }" type="text" placeholder="请输入姓名"/>
		</div>
		<div>
			<label>年龄</label>
			<input name="user.age" value="${user.age }" type="text" placeholder="请输入年龄"/>
		</div>
		<div>
			<label>性别</label>
			<input type="radio" name="user.sex" <c:if test="${user !=null && user.sex==1 }"> checked="checked"</c:if> value="1" >男
			<input type="radio" name="user.sex" <c:if test="${user !=null && user.sex==2 }"> checked="checked"</c:if> value="2" >女
		</div>
		<div>
			<label>备注</label>
			<textarea name="user.remark" placeholder="请输入备注">
				${user.remark }
			</textarea>
		</div>
		<input type="submit" value="提交" />
	</form>
</body>
</html>