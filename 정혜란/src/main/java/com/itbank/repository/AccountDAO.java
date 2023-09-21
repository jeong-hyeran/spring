package com.itbank.repository;

import org.springframework.stereotype.Repository;

import com.itbank.model.AccountDTO;

@Repository
public interface AccountDAO {

	int insert(AccountDTO dto);

	AccountDTO selsecOneByID(String userid);

}
