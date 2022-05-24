package com.ty.one_to_one.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Company;
import com.ty.one_to_one.dto.Gst;

public class TestCompanyGstSave {

	public static void main(String[] args) {

		Company company=new Company();
		company.setName("TestYantra");
		company.setPhone(789465123l);
		company.setWeb("http://Jspiders.com");
		
		Gst gst=new Gst();
		gst.setGstNumber("jspty2314");
		gst.setState("RajajiNagar");
		gst.setCountry("India");
		gst.setCompany(company);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
	
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
		
	}

}
