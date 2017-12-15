package com.mmall.dao;

import com.mmall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: Lighters_c
 * @Discrpition:
 * @Date: Created in 2:51 2017/12/16
 * @Modified_by:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class CategoryMapperTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        Category a = categoryMapper.selectByPrimaryKey(100001);
        System.out.println(a.getName());
    }

}