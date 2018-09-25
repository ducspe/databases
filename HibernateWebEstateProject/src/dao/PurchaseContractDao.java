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

import bean.Estate;
import bean.PurchaseContract;

public class PurchaseContractDao {
	
	public static int save(PurchaseContract u){
		int status = 0;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
			session.close();
			status = 1;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	
	public static int update(PurchaseContract u){
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
	public static int delete(PurchaseContract u){
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
	public static List<PurchaseContract> getAllRecords(){
		List<PurchaseContract> list=new ArrayList<PurchaseContract>();
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			list = session.createQuery("from PurchaseContract").list();
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return list;
	}
	public static PurchaseContract getRecordById(int id){
		PurchaseContract u=null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			u = (PurchaseContract) session.get(PurchaseContract.class, id);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return u;
	}
	
}
