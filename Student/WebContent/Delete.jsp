<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align ="center">学生信息管理删除信息</h2>
<form action="/Student/dee" method="post">
<p align="center">请输入需要删除的学号（ID号）：<input name ="id" type="text"/><br/></p>
                    <p align="center"> <input type="submit" value ="确定" id="bt"/></p>
                    <p align="center"> <a href='/Student/Operation.jsp'>返回上一页</a></br></p>
</form>
</body>
</html>