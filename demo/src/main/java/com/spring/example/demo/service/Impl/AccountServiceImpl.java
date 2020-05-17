package com.spring.example.demo.service.Impl;


import com.spring.example.demo.bean.Account;
import com.spring.example.demo.dao.AccountDao;
import com.spring.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Account findById(int id) {
        return accountDao.findById(id);
    }
}
