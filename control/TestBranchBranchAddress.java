package com.ty.one_to_one.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Branch;
import com.ty.one_to_one.dto.BranchAddress;

public class TestBranchBranchAddress {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		BranchAddress branchAddress=new BranchAddress();
		Branch branch=new Branch();
		branch.setName("Hdfc");
		branch.setPhone(98765139l);
		branch.setBranchCode("hdfc001234");
		
		branchAddress.setStreet("Tower clock");
		branchAddress.setState("AndhraPradesh");
		branchAddress.setCountry("India");
		branchAddress.setPincode(515701);
		branch.setBranchAddress(branchAddress);
		entityTransaction.begin();
		entityManager.persist(branchAddress);
		entityManager.persist(branch);
		entityTransaction.commit();
		System.out.println("Added");

	}

}

