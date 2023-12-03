package com.example.fyp_app.implem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fyp_app.entity.Account;
import com.example.fyp_app.repository.AccountRepository;
import com.example.fyp_app.service.AccountService;

@Service
public class AccountServiceImplem implements AccountService{
	
	@Autowired AccountRepository accountRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.
	
    @Override
    public Account getById(int userid) {
        //Pass an ID, create object for it, return all data from entry with that FileID.
    	//The ID value is gotten from the URL.
        //Recording f = new Recording();
    	Account u = accountRepository.findById(userid).orElse(null);
        return u;
    }

	@Override
	public boolean create(Account user) {
		// INSERT INTO Files(columns) VALUES (values) 
		//Convert creationdate to datetime format.
		accountRepository.save(user);
		return true;
	}

	@Override
	public List<Account> getAll() {
		// SELECT * FROM Files
		List<Account> userList = accountRepository.findAll();
		return userList;
	}

	@Override
	public boolean update(Account user) {
		// UPDATE Files SET Filename=... WHERE FileID = n;
		accountRepository.save(user);
		return true;
	}

	@Override
	public boolean delete(int userid) {
		// DELETE FROM Files WHERE FileID = n;
		accountRepository.deleteById(userid);
		return true;
	}

	@Override
	public Account getByUsername(String username) {
		Account u = accountRepository.findByUsername(username).orElse(null);
        return u;
	}
	
	
}
