package com.spring.example.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.example.service.AccountService;
import com.spring.example.vo.Account;

public class App {
	public static void main(String[] args) {

		
		/* Initialization of application context */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		/*
		 * Getting accountService object from application context with all dependency
		 */
		AccountService acccountService = (AccountService) applicationContext.getBean("accountService");
		
		acccountService.getAccount("");
		
		
		Account fromAccount = (Account) applicationContext.getBean("savingAccount");
		fromAccount.setAccountNumber("02384032943");
		
		Account toAccount = (Account) applicationContext.getBean("savingAccount");
		toAccount.setAccountNumber("02384032944");
		
		
		acccountService.transfer(fromAccount, toAccount, 100000l);

		
		
		/*
		Account fromAccount = (Account) applicationContext.getBean("savingAccount");
		fromAccount.setAccountNumber("02384032943");
		Account toAccount = (Account) applicationContext.getBean("savingAccount");
		toAccount.setAccountNumber("02384032944"); 

		acccountService.transfer(fromAccount, toAccount, 100000l); */
		
		acccountService.checkBalance(fromAccount);
		acccountService.deposit(fromAccount, 100000l);
		acccountService.withdrawal(fromAccount, 100000l); 
	}
}
