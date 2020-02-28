package edu.hue.jk.dao;

import edu.hue.jk.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface AccountDao {

    //查询所有
    @Select("select * from account")
    List<Account> findAll();

    //保存用户
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);



}
