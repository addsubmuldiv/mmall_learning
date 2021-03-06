package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
    @Test
    public void test1() {
        System.out.println(0.05+0.01);
        System.out.println(1.04-0.313);
        System.out.println(4.025*100);
        System.out.println(4.033/100);
    }

    @Test
    public void test2() {
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));

    }

    @Test
    public void test3() {
        //商业计算中一定用BigDecimal的String构造器
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));

    }
}
