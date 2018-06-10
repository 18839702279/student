<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align ="center">学生信息管理添加信息</h2>
<form action="/Student/mmm" method="post">
   <p align="center"> 学号:<input type= "text" name ="id" ></br> </p>
   <p align="center">姓名：<input type="text" name="name"></br> </p>
   <p align="center"> 性别 ：<input type="text" name="sex"></br> </p>
   <p align="center"> 班级：<input type="text" name="grade"></br> </p>
   <p align="center"><input type="submit" value="确定 "></p>
   <p align="center"><a href='/Student/Operation.jsp'>返回上一页</a></br></p>
</form>
</body>
</html>