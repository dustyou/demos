package com.itheima.utils;


import java.sql.SQLException;

/*
* 和事务相关的工具类，它包含了开启事务，提交事务，回滚事务和释放连接
*
* */
public class TransactionManager {
    /*
     * 开启事务
     * */
    public void beginTransaction() {
        System.out.println("begin transaction");
//        try {
//            connectionUtils.getThreadConnection().setAutoCommit(false);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
    
    /*
     * 提交事务
     * */
    public void commit() {
        System.out.println("commit");
//        try {
//            connectionUtils.getThreadConnection().commit();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
    
    /*
     * 回滚事务
     * */
    public void rollback() {
        System.out.println("rollback");
//        try {
//            connectionUtils.getThreadConnection().rollback();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
    
    /*
     * 释放事务
     * */
    public void release() {
        System.out.println("release");
//        try {
//            connectionUtils.getThreadConnection().close();//还回连接池中，不是真正的关闭
//            connectionUtils.removeConnection();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
    
}
