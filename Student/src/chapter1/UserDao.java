package chapter1;

import java.sql.*;
import java.util.ArrayList;



public class UserDao {
	//������Ϣ
	public boolean insert(User user){
		
		Connection conn=null;
		Statement stmt =null;
		ResultSet rs=null;
		try{
			conn=JDBCUtils.getConnection();
			stmt=conn.createStatement();
			String sql="INSERT INTO users(id,name,sex,grade)" +
			"VALUES("
			+user.getId()
			+",'"
			+user.getName()
			+"','"
			+user.getSex()
			+"','"
			+user.getGrade()+"')";
			int num=stmt.executeUpdate(sql);
			if(num>0){
				return true;
			}
			return false;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,stmt, conn);
		}
		return false;
		
	}
	//��ѯȫ����Ϣ
	public ArrayList<User>findALL(){
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<User> list=new ArrayList<User>();
		try{
			conn=JDBCUtils.getConnection();
			stmt=conn.createStatement();
			String sql="SELECT* FROM users";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				User user=new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setGrade(rs.getString("grade"));
				list.add(user);
				
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,stmt, conn);
		}
		return null;
		
		
	}
	//��ID������Ϣ
	public User find(String id){
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=JDBCUtils.getConnection();
			stmt=conn.createStatement();
			String sql="SELECT* FROM users WHERE id="+id;
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				User user=new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setGrade(rs.getString("grade"));
				return user;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, stmt,conn);
		}
		return null;
		
	}
	//ɾ����Ϣ����
	public boolean delete(String id){
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=JDBCUtils.getConnection();
			stmt=conn.createStatement();
			String sql="DELETE FROM users WHERE id="+id;
			int num=stmt.executeUpdate(sql);
			if(num>0){
				return true;
			}
			return false;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,stmt, conn);
		}
		return false;
		
		}
	//�޸���Ϣ
	public boolean update(User user){
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=JDBCUtils.getConnection();
			stmt=conn.createStatement();
			String sql="UPDATE users set name='"+user.getName()+"',"
					+ "sex='"+user.getSex()+"',"
					+"grade='"+user.getGrade()
					+"'WHERE id="+user.getId();
			int num=stmt.executeUpdate(sql);
			if(num>0){
				return true;
			}
			return false;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,stmt, conn);
		}
		return false;
		
	}

}