/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import lam.util.MathUility;

/**
 *
 * @author sasuk
 */
public class MathUtil {
    public static void main(String[] args) {
        try {
            System.out.println("5! =" + MathUility.getFactorial(5));
            //thực tế là ACTUAL
            //so sánh cái hy vọng và  EXPECTED
            //khi ACTUAL==EXPECTED => hàm chạy đúng
            System.out.println("0! ="+MathUility.getFactorial(0)); 
            //EXPECTED=1
            //ACTUAL = ?
            System.out.println("-5! ="+MathUility.getFactorial(-5));
            //EXPECTED: IllegalArgumentException
            //cách test này gọi là MANUAL => NHÌN BẰNG MẮT
            //cách xịn sò, dùng màu sắc xanh đỏ để luận kết quả đúng sai của hàm
            //Cách này gọi là TEST AUTOMATION
            //T3
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }
}
