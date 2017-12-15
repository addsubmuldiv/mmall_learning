package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper {
    //按主键删除
    int deleteByPrimaryKey(Integer id);
    //不判空插入
    int insert(Cart record);
    //判空插入
    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);
    //判空更新
    int updateByPrimaryKeySelective(Cart record);
    //不判空更新
    int updateByPrimaryKey(Cart record);
}