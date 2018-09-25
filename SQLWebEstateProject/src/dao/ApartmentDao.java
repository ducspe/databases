package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.Apartment;

public class ApartmentDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Apartment u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into apartment(apartment_id, floor, rent, rooms, balcony, builtinkitchen) values(?,?,?,?,?,?)");
			ps.setInt(1,u.getApartment_id());
			ps.setInt(2,u.getFloor());
			ps.setInt(3,u.getRent());
			ps.setInt(4,u.getRooms());
			ps.setString(5, u.getBalcony());
			ps.setString(6, u.getBuiltinkitchen());
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
