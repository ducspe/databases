package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Person;

public class PersonDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Person u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into person(person_id,firstname, name, address) values(?,?,?,?)");
			ps.setInt(1,u.getPerson_id());
			ps.setString(2,u.getFirstname());
			ps.setString(3,u.getName());
			ps.setString(4,u.getAddress());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Person u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update person set firstname=?, name=?, address=? where id=?");
			ps.setString(1,u.getFirstname());
			ps.setString(2,u.getName());
			ps.setString(3,u.getAddress());
			ps.setInt(4,u.getPerson_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Person u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from person where id=?");
			ps.setInt(1,u.getPerson_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Person> getAllRecords(){
		List<Person> list=new ArrayList<Person>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from person");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Person u=new Person();
				u.setPerson_id(rs.getInt("person_id"));
				u.setFirstname(rs.getString("firstname"));
				u.setName(rs.getString("name"));
				u.setAddress(rs.getString("address"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Person getRecordById(int id){
		Person u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from person where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Person();
				u.setPerson_id(rs.getInt("person_id"));
				u.setFirstname(rs.getString("firstname"));
				u.setName(rs.getString("name"));
				u.setAddress(rs.getString("address"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
	
}
