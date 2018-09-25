package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.House;

public class HouseDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(House u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into house(house_id, floors, price, garden) values(?,?,?,?)");
			ps.setInt(1,u.getHouse_id());
			ps.setInt(2,u.getFloors());
			ps.setInt(3,u.getPrice());
			ps.setString(4,u.getGarden());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(House u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update house set floors=?, price=?, garden=? estate_id=? where id=?");
			ps.setInt(1,u.getFloors());
			ps.setInt(2,u.getPrice());
			ps.setString(3,u.getGarden());
			ps.setInt(4,u.getHouse_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(House u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from house where house_id=?");
			ps.setInt(1,u.getHouse_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<House> getAllRecords(){
		List<House> list=new ArrayList<House>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from house");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				House u=new House();
				u.setHouse_id(rs.getInt("house_id"));
				u.setFloors(rs.getInt("floors"));
				u.setPrice(rs.getInt("price"));
				u.setGarden(rs.getString("garden"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static House getRecordById(int id){
		House u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from house where house_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new House();
				u.setHouse_id(rs.getInt("house_id"));
				u.setFloors(rs.getInt("floors"));
				u.setPrice(rs.getInt("price"));
				u.setGarden(rs.getString("garden"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
}
