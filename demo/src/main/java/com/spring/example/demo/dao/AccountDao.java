package com.spring.example.demo.dao;


import com.spring.example.demo.bean.Account;
public interface AccountDao {
    Account findById(int id);
}
