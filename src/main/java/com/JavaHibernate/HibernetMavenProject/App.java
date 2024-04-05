package com.JavaHibernate.HibernetMavenProject;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App 
{
    public static void main( String[] args ) throws HibernateException
    {
    	
    	 Session ss=new Configuration().configure().buildSessionFactory().openSession();
         
         Emp e=new Emp();
         e.setId(1);
         e.setName("Akash");
         e.setAddress("Champahati");
         ss.persist(e);
         ss.beginTransaction();
         System.out.println("Saved");
    }
}
