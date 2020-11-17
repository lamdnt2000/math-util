/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lam.util;

/**
 *
 * @author sasuk
 */
public class MathUility {

    //JDK có class java.util.Math, có 1 loạt hàm static
    //                                  .abs(), .sin(), .sqrt(). pow(a,b)
    //                                  .PI = 3.1415
    public static final double PI = 3.1415;

    //hàm tính n! = 1.2.3...n!
    //n tăng nhanh, nên mình tính 20! tối đa, 21! tràn long
    //0!=1!=1;
    //ko có âm giai thừa
    //if n<0 ném Exception
    public static long getFactorial(int n) throws IllegalArgumentException {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("invalid number");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    
}
