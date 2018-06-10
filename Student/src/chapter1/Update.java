package chapter1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Update extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		UserDao ud=new UserDao();
		User user=new User();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String grade=request.getParameter("grade");
		
		
		user.setId(id);
		user.setName(name);
		user.setSex(sex);
		user.setGrade(grade);
		
		boolean b=ud.update(user);
		if(b){
			PrintWriter pw=response.getWriter();
			pw.print("�޸ĳɹ���"+"</br>"+"<a href='/Student/Update.jsp'>�����޸���Ϣ</a>"+"</br>"
			
			+"<a href='/Student/Operation.jsp'>������ҳ��</a>");
		}else{
			PrintWriter pw=response.getWriter();
			pw.print("�޸�ʧ�ܣ�"+"</br>"+"<a href='/Student/Update.jsp'>�����޸���Ϣ</a>"+"</br>"
			
			+"<a href='/Student/Operation.jsp'>������ҳ��</a>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}