package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.TenancyContract;

public class TenancyContractDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(TenancyContract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into tenancycontract(tc_id, startdate, duration, additionalcosts) values(?,?,?,?)");
			ps.setInt(1,u.getTc_id());
			ps.setDate(2,u.getStartdate());
			ps.setInt(3,u.getDuration());
			ps.setInt(4,u.getAdditionalcosts());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
