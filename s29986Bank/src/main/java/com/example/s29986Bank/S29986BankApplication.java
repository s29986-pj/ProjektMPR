package com.example.s29986Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S29986BankApplication {

	public S29986BankApplication(AccountService accountService) {
		accountService.registerAccount(1, 1200);

		accountService.deposit(1, 200);
		accountService.transfer(1, 800);
		accountService.listAccountInfo(1);
	}

	public static void main(String[] args) {
		SpringApplication.run(S29986BankApplication.class, args);
	}

}
