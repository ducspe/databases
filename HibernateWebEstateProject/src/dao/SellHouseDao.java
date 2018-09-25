package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import bean.*;

public class SellHouseDao {
	
	public static int save(SellHouse u){
		
		House h = new House(u.getFloors(), u.getPrice(), u.getGarden());
		HouseDao.save(h);
		System.out.println(h);
		
		Person p = new Person(u.getPerson_id(), u.getFirstname(), u.getName(), u.getAddress());
		System.out.println(p);
		PersonDao.save(p);
		
	    Date contractDate = Date.valueOf(u.getDate());
		
		PurchaseContract pc = new PurchaseContract(contractDate, u.getPlace(), u.getNoOfInstallments(), u.getInterestrate());
		int contract_id = PurchaseContractDao.save(pc);
		System.out.println(pc);
		
		Sells s = new Sells(u.getHouse_id(),u.getPerson_id(), contract_id);
		SellsDao.save(s);
		System.out.println(s);
		
		return 0;
	}

	
	
}
