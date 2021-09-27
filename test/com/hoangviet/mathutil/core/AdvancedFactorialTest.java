/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangviet.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Hoang-Kyo
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    // ta viet ki thuat moi, tach data ra han cac lenh kiem tra hamf
    // data nay ta co the dat o file .txt, .csv, .excel, database ben
    // input và output/ expected là những cặp
    // nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều
    // mảng 2 chiều này sẽ đc nạp từ .txt, db,...
    // hoặc ta tạo luôn 1 mảng 2 chiều ngay đây
    @Parameters
    public static Object[][] initData() { //tên hàm tuỳ ý
        return new Integer[][] {
                                  {0, 1},
                                  {1, 1},
                                  {2, 2},
                                  {3, 6},
                                  {4, 24},
                                  {5, 120}
                                };
    }
    
    
    // tan  cần map 2 cột vào 2 biến để lát hồi nhồi /feed nhúng vào 
    // hàm checkFactorial, ta gội là testing kiểu tham số hoá
    // parameterized testing
    @Parameter(value = 0) //Map cột 0 của tập data
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
        Assert.assertEquals(expected, MathUtil.getFactorial(input));           
    }       
            
            
            
}
