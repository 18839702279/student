<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align ="center">学生信息管理查询信息</h2>
<form  action="/Student/off" method="post">
 <p align="center">请输入需要查询的ID：<input name ="id" type="text"/><br/></p>

     <p align="center"><input type="submit" value ="确定" id="bt"/></p>
    <p align="center"> <a href='/Student/Search.jsp'>返回上一页</a></br></p>

</form>
</body>
</html>