package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import bean.Estate;
import config.HibernateUtil;

public class EstateDao {

	
	public static int save(Estate u, String manager){
		int status = 0;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			u.setManager(EstateAgentDao.getRecordById(manager));
			session.save(u);
			session.getTransaction().commit();
			session.close();
			status = 1;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	
	public static int update(Estate u, String manager){
		int status = 0;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			u.setManager(EstateAgentDao.getRecordById(manager));
			session.update(u);
			session.getTransaction().commit();
			session.close();
			status = 1;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	public static int delete(Estate u){
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
	public static List<Estate> getAllRecords(String username){
		List<Estate> list=new ArrayList<Estate>();
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			Query query = session.createQuery("FROM Estate e WHERE e.manager = :user");
			query.setParameter("user", EstateAgentDao.getRecordById(username));
			list = query.list();
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return list;
	}
	public static Estate getRecordById(int id){
		Estate u=null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
			Session session = sessionFactory.openSession(); 
			session.beginTransaction();
			u = (Estate) session.get(Estate.class, id);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return u;
	}
	
}
