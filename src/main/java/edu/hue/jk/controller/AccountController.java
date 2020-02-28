package edu.hue.jk.controller;


import edu.hue.jk.domain.Account;
import edu.hue.jk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有");
       List<Account> list = accountService.findAll();
       model.addAttribute("list",list);
        return "list";
    }

    //查询所有
    @RequestMapping("/saveAccount")
    public String  findAll(Account account){
        System.out.println("表现层：查询所有");
        accountService.saveAccount(account);

        return "redirect:/account/findAll";
    }
}
