package edu.hue.jk.test;

import edu.hue.jk.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testService {

    @Test
    public void testfindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}
