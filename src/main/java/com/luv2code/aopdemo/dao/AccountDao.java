package com.luv2code.aopdemo.dao;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDao {

	public void addAccount(Account a, Boolean flag){
		System.out.println(a.getAccountname() +"in account dao:addaccount method");
	}
}
