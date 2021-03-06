/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangviet.mathutil.core;

/**
 *
 * @author Hoang-Kyo
 */
public class MathUtil {

    
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0...");
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; // tich don
        for (int i = 1; i <= n; i++)
            product *= i;
        
        return product;
    }
    
}
