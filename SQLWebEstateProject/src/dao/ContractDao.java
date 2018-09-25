package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Contract;

public class ContractDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Contract u){
		int last_inserted_id=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into contract(date, place) values(?,?)");
			ps.setDate(1,u.getDate());
			ps.setString(2,u.getPlace());
			ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		
		// The following code will return the index of the last inserted contract
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select contract_id from contract order by contract_id asc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				last_inserted_id = rs.getInt("contract_id");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return last_inserted_id;
	}
	
	public static int update(Contract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update contract set date=?, place=? where id=?");
			ps.setDate(1,u.getDate());
			ps.setString(2,u.getPlace());
			ps.setInt(3,u.getContract_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Contract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from contract where contract_id=?");
			ps.setInt(1,u.getContract_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Contract> getAllRecords(){
		List<Contract> list=new ArrayList<Contract>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from contract");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Contract u=new Contract();
				u.setContract_id(rs.getInt("contract_id"));
				u.setDate(rs.getDate("date"));
				u.setPlace(rs.getString("place"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Contract getRecordById(int id){
		Contract u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from contract where contract_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Contract();
				u.setContract_id(rs.getInt("contract_id"));
				u.setDate(rs.getDate("date"));
				u.setPlace(rs.getString("place"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
}
