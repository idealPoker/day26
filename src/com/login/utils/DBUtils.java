package com.login.utils;

import java.sql.*;

public class DBUtils {
    private static String url=DBConfig.getValue("url");
    private static String username=DBConfig.getValue("username");
    private static String password=DBConfig.getValue("password");
    static{
        try {  //注册驱动
            Class.forName(DBConfig.getValue("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    public static void closeConnection(ResultSet rs, Statement stmt,Connection conn){
        try {
            if(rs!=null){
                rs.close();
            }if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
