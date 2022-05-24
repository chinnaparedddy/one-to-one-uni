package com.ty.one_to_one.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Branch;
import com.ty.one_to_one.dto.BranchAddress;

public class TestDeleteBranchAddress {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//BranchAddress branchAddress=new BranchAddress();
		//Branch branch=new Branch();
		Branch branch=entityManager.find(Branch.class, 1);
		BranchAddress branchAddress=branch.getBranchAddress();
		entityTransaction.begin();
		entityManager.remove(branch);
		entityManager.remove(branchAddress);
		entityTransaction.commit();
		System.out.println("Deleted");
		
	}

}
