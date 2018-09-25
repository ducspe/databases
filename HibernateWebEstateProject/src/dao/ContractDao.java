package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.HibernateUtil;

import bean.Contract;
import bean.Estate;

public class ContractDao {
	
	public static int save(Contract u){
		Integer last_inserted_id = new Integer(0);
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			last_inserted_id = (Integer) session.save(u);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return last_inserted_id.intValue();
	}
	
	public static int update(Contract u){
		int status = 0;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			session.update(u);
			session.getTransaction().commit();
			session.close();
			status = 1;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	public static int delete(Contract u){
		int status = 0;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			session.delete(u);
			session.getTransaction().commit();
			session.close();
			status = 1;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	public static List<Contract> getAllRecords(){
		List<Contract> list=new ArrayList<Contract>();
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			list = session.createQuery("from Contract").list();
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return list;
	}
	public static Contract getRecordById(int id){
		Contract u=null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			u = (Contract) session.get(Contract.class, id);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return u;
	}
}
