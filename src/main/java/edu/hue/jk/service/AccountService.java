package edu.hue.jk.service;

import edu.hue.jk.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有
    List<Account> findAll();

    //保存用户
    void saveAccount(Account account);
}
