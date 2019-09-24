package com.login.dao;

import com.login.domain.Account;

/*
操作数据库得接口
 */
public interface AccountDao {

    Account findAccount(String username,String password);
}
