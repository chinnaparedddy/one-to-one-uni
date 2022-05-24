package com.ty.one_to_one.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Branch;
import com.ty.one_to_one.dto.BranchAddress;

public class TestAllBranchersAndAddress {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch=entityManager.find(Branch.class, 2);
		BranchAddress branchAddress=branch.getBranchAddress();
		System.out.println("Branch id is: "+branch.getId());
		System.out.println("Branch Name is: "+branch.getName());
		System.out.println("Branch Branch Code is: "+branch.getBranchCode());
		System.out.println("Branch Phone Number is: "+branch.getPhone());
		System.out.println("*********************************");
		System.out.println("Branch ID: "+branchAddress.getId());
		System.out.println("Branch Street: "+branchAddress.getStreet());
		System.out.println("Branch State: "+branchAddress.getState());
		System.out.println("Branch Country: "+branchAddress.getCountry());
		System.out.println("Branch PinCode: "+branchAddress.getPincode());
	}

}
