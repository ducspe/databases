package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.EstateAgent;
import bean.LoginBean;
public class EstateAgentDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(EstateAgent u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into estateagent(name,address,username,password) values(?,?,?,?)");
		ps.setString(1,u.getName());
		ps.setString(2,u.getAddress());
		ps.setString(3,u.getUsername());
		ps.setString(4,u.getPassword());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(EstateAgent u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update estateagent set name=?, address=?, username=?, password=? where agent_id=?");
		ps.setString(1,u.getName());
		System.out.println(u.getName());
		ps.setString(2,u.getAddress());
		ps.setString(3,u.getUsername());
		ps.setString(4,u.getPassword());
		ps.setInt(5,u.getAgent_id());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(EstateAgent u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from estateagent where agent_id=?");
		ps.setInt(1,u.getAgent_id());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<EstateAgent> getAllRecords(){
	List<EstateAgent> list=new ArrayList<EstateAgent>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from estateagent");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			EstateAgent u=new EstateAgent();
			u.setAgent_id(rs.getInt("agent_id"));
			u.setName(rs.getString("name"));
			u.setAddress(rs.getString("address"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static EstateAgent getRecordById(int id){
	EstateAgent u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from estateagent where agent_id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new EstateAgent();
			u.setAgent_id(rs.getInt("agent_id"));
			u.setName(rs.getString("name"));
			u.setAddress(rs.getString("address"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}

public static boolean validate(LoginBean bean){
	boolean status=false;
	try{
		Connection con=getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from estateagent where username=? and password=?");
		ps.setString(1,bean.getUsername());
		ps.setString(2,bean.getPassword());
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
			
		
		
	}catch(Exception e){}
	return status;
}

public static boolean isSuperuser(LoginBean bean){
	boolean status = false;
	if (bean.getUsername().equals("sudo") && bean.getPassword().equals("super")){
		status = true;
	}
	return status;
}

}
