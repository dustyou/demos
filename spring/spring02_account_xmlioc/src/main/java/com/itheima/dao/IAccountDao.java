package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/*
* 账户的持久层接口
* */
public interface IAccountDao {
    /*
     * 查询所有
     * */
    List<Account> findAllAccount();
    
    /*
     * 查询一个
     * */
    Account findAccountById(Integer accountId);
    //保存
    void saveAccount(Account acc);
    
    //更新
    void updateAccount(Account acc);
    
    //删除
    void deleteAccount(Integer accountId);
}
