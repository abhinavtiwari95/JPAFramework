package com.jpaframwork.JPAFramwok;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        
    					// Inserting an entity
    	
    	Employee emp = new Employee();
    	emp.setEmpid(2);
    	emp.setEmpname("Amit");
    	emp.setEmpaddress("Pune");
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("put");
        EntityManager em = emf.createEntityManager();
        
        					// Finding an entity
        
//        Employee emp = em.find(Employee.class, 1);
        
        
        					//Updating an entity
//        Employee emp = em.find(Employee.class, 2);
//        
//        emp.setEmpname("rohit");
//        emp.setEmpaddress("gaya");
        
        
        					//Deleting an entity
        
//        Employee emp = em.find(Employee.class, 2);
//        
//        em.getTransaction().begin();
//        em.remove(emp);
//        em.getTransaction().commit();
//        System.out.println(emp);
        
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println(emp);
    }
}
