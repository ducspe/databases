package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import bean.*;

public class SellHouseDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	
	public static int save(SellHouse u){
		
		House h = new House(u.getHouse_id(), u.getFloors(), u.getPrice(), u.getGarden());
		HouseDao.save(h);
		System.out.println(h);
		
		Person p = new Person(u.getPerson_id(), u.getFirstname(), u.getName(), u.getAddress());
		System.out.println(p);
		PersonDao.save(p);
		
	    Date contractDate = Date.valueOf(u.getDate());
		
		Contract c = new Contract(contractDate, u.getPlace());
		int contract_id = ContractDao.save(c);
		System.out.println(c);
		
		PurchaseContract pc = new PurchaseContract(contract_id, u.getNoOfInstallments(), u.getInterestrate());
		PurchaseContractDao.save(pc);
		System.out.println(pc);
		
		Sells s = new Sells(u.getHouse_id(),u.getPerson_id(), contract_id);
		SellsDao.save(s);
		System.out.println(s);
		
		return 0;
	}

	
	
}
