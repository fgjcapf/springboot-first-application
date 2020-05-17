package com.spring.example.demo.web;


import com.spring.example.demo.bean.Account;
import com.spring.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id){
        return accountService.findById(id);
    }

}
