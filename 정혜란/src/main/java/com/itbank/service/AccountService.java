package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.HashComponent;
import com.itbank.model.AccountDTO;
import com.itbank.repository.AccountDAO;

@Service
public class AccountService {

	@Autowired
	private HashComponent hashComponent;
	@Autowired
	private AccountDAO accountDAO;
	
	public int insert(AccountDTO dto) {
		String salt = hashComponent.getRandomSalt();
		String hash = hashComponent.getHash(dto.getUserpw(), salt);
		dto.setSalt(salt);
		dto.setUserpw(hash);
		int row = accountDAO.insert(dto);
		return row;
	}

	public AccountDTO login(AccountDTO dto) {
		AccountDTO login = accountDAO.selsecOneByID(dto.getUserid());
		if (login != null) {
			String oldHash = login.getUserpw();
			String newHash = hashComponent.getHash(dto.getUserpw(), login.getSalt());
			if (oldHash.equals(newHash)) {
				return login;
			}
		}
		return null;
	}

}
