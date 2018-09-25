package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.EstateAgent;
import bean.LoginBean;

import config.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EstateAgentDao {
	
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
        con=DriverManager.getConnection("jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP","vsisp33","Og14leay");
	}catch(Exception e){System.out.println(e);}
	return con;
}

public static int save(EstateAgent u){
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
public static int update(EstateAgent u){
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
public static int delete(EstateAgent u){
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

public static List<EstateAgent> getAllRecords(){
	List<EstateAgent> list=new ArrayList<EstateAgent>();
	
	try{
		SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();
		list = session.createQuery("from EstateAgent").list();
		session.getTransaction().commit();
		session.close();
	}catch(Exception e){
		System.out.println(e);
	}
	
	return list;
}
public static EstateAgent getRecordById(String username){
	EstateAgent u=null;
	
	try{
		SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();
		u = (EstateAgent) session.get(EstateAgent.class, username);
		System.out.println("from estate agent dao: " + u.getUsername());
		session.getTransaction().commit();
		session.close();
	}catch(Exception e){
		System.out.println(e);
	}
	
	return u;
}

public static boolean validate(LoginBean bean){
	boolean status=false;
	try{
		Connection con=getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from estateagent where username=? and password=?");
		ps.setString(1,bean.getUsername());
		ps.setString(2,bean.getPassword());
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
			
		
		
	}catch(Exception e){}
	return status;
}

public static boolean isSuperuser(LoginBean bean){
	boolean status = false;
	if (bean.getUsername().equals("sudo") && bean.getPassword().equals("super")){
		status = true;
	}
	return status;
}

}
