package com.example.fyp_app.implem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fyp_app.entity.Account;
import com.example.fyp_app.entity.Camera;
import com.example.fyp_app.repository.AccountRepository;
import com.example.fyp_app.service.AccountService;


//Service layer, business logic is contained here to keep it separate from the controller.
//Where the actual logic of the (Entity)Service.java Interface methods are implemented.
@Service
public class AccountServiceImplem implements AccountService{
	
	@Autowired AccountRepository accountRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.


	@Override
	public Account createAccount(Account user) {
		accountRepository.save(user);
		Account a = new Account();
		a.setUserid(user.getUserid());
		a.setUsername(user.getUsername());
		a.setPassword(user.getPassword());
		return a;
	}

	@Override
	public Account getAccountById(int userid) {
		System.out.println("userid="+userid);
		Account u = accountRepository.findById(userid).orElse(null);
        return u;
	}

	@Override
	public boolean updateAccount(Account user) {
		accountRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteAccount(int userid) {
		accountRepository.deleteById(userid);
		return true;
	}

	@Override
	public Account getAccountByUsername(String username) {
		Account u = accountRepository.findByUsername(username).orElse(null);
		return u;
	}
	
	
	
}
