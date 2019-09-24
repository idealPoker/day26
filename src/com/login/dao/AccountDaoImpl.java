package com.login.dao;

import com.login.domain.Account;
import com.login.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account findAccount(String name, String pwd) {
        String sql = "select *from account where name=? and pwd=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, pwd);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String username1 = rs.getString("name");
                String password1 = rs.getString("pwd");
                Account account = new Account();
                account.setId(id);
                account.setName(name);
                account.setPwd(pwd);
                return account;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally    //关闭数据库相关的连接
        {
            DBUtils.closeConnection(rs, pstmt, conn);
        }
        return null;
    }
}
