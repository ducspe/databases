package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Estate;

public class EstateDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Estate u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into estate(city, postalcode, street, streetnumber, squarearea, manager) values(?,?,?,?,?,?)");
			ps.setString(1,u.getCity());
			ps.setInt(2,u.getPostalcode());
			ps.setString(3,u.getStreet());
			ps.setInt(4,u.getStreetnumber());
			ps.setInt(5,u.getSquarearea());
			ps.setString(6,u.getManager());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Estate u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update estate set city=?, postalcode=?, street=?, streetnumber=?, squarearea=?, manager=? where estate_id=?");
			ps.setString(1,u.getCity());
			ps.setInt(2,u.getPostalcode());
			ps.setString(3,u.getStreet());
			ps.setInt(4,u.getStreetnumber());
			ps.setInt(5,u.getSquarearea());
			ps.setString(6,u.getManager());
			ps.setInt(7,u.getEstate_id());
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Estate u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from estate where estate_id=?");
			ps.setInt(1,u.getEstate_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Estate> getAllRecords(String username){
		List<Estate> list=new ArrayList<Estate>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from estate where manager=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Estate u=new Estate();
				u.setEstate_id(rs.getInt("estate_id"));
				u.setCity(rs.getString("city"));
				u.setPostalcode(rs.getInt("postalcode"));
				u.setStreet(rs.getString("street"));
				u.setStreetnumber(rs.getInt("streetnumber"));
				u.setSquarearea(rs.getInt("squarearea"));
				u.setManager(rs.getString("manager"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Estate getRecordById(int id){
		Estate u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from estate where estate_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Estate();
				u.setEstate_id(rs.getInt("estate_id"));
				u.setCity(rs.getString("city"));
				u.setPostalcode(rs.getInt("postalcode"));
				u.setStreet(rs.getString("street"));
				u.setStreetnumber(rs.getInt("streetnumber"));
				u.setSquarearea(rs.getInt("squarearea"));
				u.setManager(rs.getString("manager"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
	
}
