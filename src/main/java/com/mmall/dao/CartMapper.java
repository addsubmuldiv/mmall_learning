package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productIdList")List<String> productIdList);

    int checkedOrUncheckedProduct(@Param("userId")Integer userId,@Param("productId") Integer productId,@Param("checked")Integer checked);

    int selectCartProductCount(@Param("userId") Integer userId);
}