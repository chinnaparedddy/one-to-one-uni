package com.ty.one_to_one.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Pan;
import com.ty.one_to_one.dto.Person;

public class TestPanAndPersonSave {

	public static void main(String[] args) {

		Person person=new Person();
		person.setName("uday");
		person.setEmail("udaya@gmail.com");
		person.setPhone(9989451);
		
		Pan pan=new Pan();
		
		pan.setAddress("Karnool");
		pan.setPanNumber("KARN978A");
		person.setPan(pan);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
