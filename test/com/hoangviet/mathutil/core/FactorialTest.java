/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangviet.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Hoang-Kyo
 */
public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
    
    //check cem có th ngoại lệ hay ko khi đua data cà chớn!
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        // ta ko dung ham assertEquals( 2 value so sanh)
        // ngoai le chi co the thay no xh hay ko???
        MathUtil.getFactorial(-5);
    }
    
    
    
    
    // QUY UOC XANH DO;
    // 1. XANH, TẤT CẢ TÌNH HUỐNG SO SÁNH XÀI HÀM PHẢI CÙNG XANH
    // 2. ĐỎ, CHỈ CẦN 1 TÌNH HUỐNG XÀI HÀM BỊ BỎ, COI NHƯ CẢ HÀM ĐỎ
    // ĐỎ: 
    // HOẶC BẠN TÍNH 
    
}
