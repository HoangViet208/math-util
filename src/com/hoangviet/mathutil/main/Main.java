/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangviet.mathutil.main;

import com.hoangviet.mathutil.core.MathUtil;

/**
 *
 * @author Hoang-Kyo
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        // test manual, đưa data, gọi hàm check, so sânhs expected vs. actual
        // tất cả, đặt biệt phần cmp là phải bằng mắt, cho từng tình huống
        System.out.println("0! - 1? " + MathUtil.getFactorial(0));
        System.out.println("1! - 1? " + MathUtil.getFactorial(1));
        System.out.println("2! - 2? " + MathUtil.getFactorial(2));
        System.out.println("3! - 6? " + MathUtil.getFactorial(3));
        
    }
}
