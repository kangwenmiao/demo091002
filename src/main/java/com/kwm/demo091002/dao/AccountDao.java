package com.kwm.demo091002.dao;

import com.kwm.demo091002.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Integer> {
}
