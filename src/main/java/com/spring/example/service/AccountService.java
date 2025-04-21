package com.spring.example.service;

import com.spring.example.vo.Account;
import com.spring.example.vo.CurrentAccount;
import com.spring.example.vo.SavingAccount;

public class AccountService {
	
	private CurrentAccount currentAccount;
	private SavingAccount savingAccount;
	private IAccountServiceDAO accountServiceDAO;
	
	public void getAccount(String account) {
		System.out.println("Current Account " + currentAccount);
		System.out.println("Saving Account " + savingAccount);
	}


	public void transfer(Account fromAccount, Account toAccount, Long amount) {
		accountServiceDAO.transfer(fromAccount, toAccount, amount);
	}

	public Double checkBalance(Account account) {
		accountServiceDAO.checkBalance(account);
		return Double.valueOf(100000);
	}

	public Long withdrawal(Account account, Long amount) {
		accountServiceDAO.withdrawal(account, amount);
		return amount;
	}

	public void deposit(Account account, Long amount) {
		accountServiceDAO.deposit(account, amount);
	}
	
	
	
	public CurrentAccount getCurrentAccount() {
		return currentAccount;
	}
	
	
	public void setCurrentAccount(CurrentAccount currentAccount) {
		this.currentAccount = currentAccount;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}


	public IAccountServiceDAO getAccountServiceDAO() {
		return accountServiceDAO;
	}


	public void setAccountServiceDAO(IAccountServiceDAO accountServiceDAO) {
		this.accountServiceDAO = accountServiceDAO;
	}
	
	

}
