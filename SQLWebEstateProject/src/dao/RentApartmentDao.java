package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import bean.Apartment;
import bean.Contract;
import bean.Person;
import bean.RentApartment;
import bean.Rents;
import bean.TenancyContract;

public class RentApartmentDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
	        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	
	public static int save(RentApartment u){
		
		Apartment a = new Apartment(u.getApartment_id(),u.getFloor(),u.getRent(),u.getBalcony(),u.getBuiltinkitchen());
		ApartmentDao.save(a);
		System.out.println(a);
		
		Person p = new Person(u.getPerson_id(), u.getFirstname(), u.getName(), u.getAddress());
		System.out.println(p);
		PersonDao.save(p);
		
	    Date contractDate = Date.valueOf(u.getDate());
		
		Contract c = new Contract(contractDate, u.getPlace());
		int contract_id = ContractDao.save(c);
		System.out.println(c);
		
		Date startdate = Date.valueOf(u.getStartdate());
		TenancyContract tc = new TenancyContract(contract_id,startdate,u.getDuration(),u.getAdditionalcosts());
		TenancyContractDao.save(tc);
		System.out.println(tc);
		
		Rents r = new Rents(u.getApartment_id(),u.getPerson_id(), contract_id);
		RentsDao.save(r);
		System.out.println(r);
		
		return 0;
	}
	
	
}
