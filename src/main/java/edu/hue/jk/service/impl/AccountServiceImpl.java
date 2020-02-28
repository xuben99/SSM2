package edu.hue.jk.service.impl;

import edu.hue.jk.dao.AccountDao;
import edu.hue.jk.domain.Account;
import edu.hue.jk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {

        System.out.println("业务层：查询所有");


        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.saveAccount(account);
    }
}
