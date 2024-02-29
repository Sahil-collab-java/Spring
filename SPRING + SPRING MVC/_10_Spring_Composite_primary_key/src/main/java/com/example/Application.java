package com.example;

import com.example.Model.Account;
import com.example.Model.AccountPK;
import com.example.Repo.AccountRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

	AccountRepo repo = applicationContext.getBean(AccountRepo.class);

		Account account = new Account();

		account.setHolderName("sam");
		account.setBranch("Anmol");

		AccountPK accountPK = new AccountPK();

		accountPK.setAccNum(456555445L);
		accountPK.setAccType("Saving");

		account.setAccountPK(accountPK);

		repo.save(account);

		System.out.println("Record Save SucessFully......................");


	}

}
