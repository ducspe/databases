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

	public static int save(RentApartment u){
		
		Apartment a = new Apartment(u.getFloor(),u.getRent(),u.getBalcony(),u.getBuiltinkitchen());
		ApartmentDao.save(a);
		System.out.println(a);
		
		Person p = new Person(u.getPerson_id(), u.getFirstname(), u.getName(), u.getAddress());
		System.out.println(p);
		PersonDao.save(p);
		
	    Date contractDate = Date.valueOf(u.getDate());
		Date startdate = Date.valueOf(u.getStartdate());
		TenancyContract tc = new TenancyContract(contractDate, u.getPlace(), startdate,u.getDuration(),u.getAdditionalcosts());
		
		int contract_id=TenancyContractDao.save(tc);
		System.out.println(tc);
		
		Rents r = new Rents(u.getApartment_id(),u.getPerson_id(), contract_id);
		RentsDao.save(r);
		System.out.println(r);
		
		return 0;
	}
	
	
}
