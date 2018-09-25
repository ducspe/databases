package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.PurchaseContract;

public class PurchaseContractDao {
	
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(PurchaseContract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into purchasecontract(pc_id, noofinstallments, interestrate) values(?,?,?)");
			ps.setInt(1,u.getPc_id());
			ps.setInt(2,u.getNoOfInstallments());
			ps.setInt(3,u.getInterestrate());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int update(PurchaseContract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update purchasecontract set noofinstallments=?, interestrate=? where id=?");
			ps.setInt(1,u.getNoOfInstallments());
			ps.setInt(2,u.getInterestrate());
			ps.setInt(3, u.getPc_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(PurchaseContract u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from purchasecontract where pc_id=?");
			ps.setInt(1,u.getPc_id());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<PurchaseContract> getAllRecords(){
		List<PurchaseContract> list=new ArrayList<PurchaseContract>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from purchasecontract");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				PurchaseContract u=new PurchaseContract();
				u.setPc_id(rs.getInt("pc_id"));
				u.setNoOfInstallments(rs.getInt("noofinstallments"));
				u.setInterestrate(rs.getInt("interestrate"));
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static PurchaseContract getRecordById(int id){
		PurchaseContract u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from purchasecontract where pc_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new PurchaseContract();
				u.setPc_id(rs.getInt("pc_id"));
				u.setNoOfInstallments(rs.getInt("noofinstallments"));
				u.setInterestrate(rs.getInt("interestrate"));
			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
	
}
