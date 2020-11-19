/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lam.util.test;

import lam.util.MathUility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sasuk
 */
public class MathUtilityTest {
    @Test 
    //kí hiệu của junit đưa ra, biến hàm ngay sau đây thành 
    //public static void main(), app có nhiều main
    //F6 chạy main() mặc định, Shift-F6 là chạy main ở Test
    public void getFactorial_RunsWell_IfValidArguments(){
        Assert.assertEquals(720, MathUility.getFactorial(6));
        Assert.assertEquals(120, MathUility.getFactorial(5));
        Assert.assertEquals(24, MathUility.getFactorial(4));
        Assert.assertEquals(6, MathUility.getFactorial(3));
        Assert.assertEquals(1, MathUility.getFactorial(0));
        
        
    }
    //XANH chỉ đạt được khi tất cả đều đạt được
    //ĐỎ chỉ cần ít nhất một thằng đỏ
    //ý nghĩa: hàm đã xanh đỏ thì phải đúng hết, sai 1 cái hay vài cái
    //hàm ko đáng tin
    
    
    
}
//Viết code để test code chỉnh (MathUltility)
//Viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine,... để test
//xem code chỉnh chạy ổn ko trước khi đem qua bên QC/Khách hàng trải nghiệm
// và thư viện này cung cấp cái cơ chế báo đúng sai qua màu sắc xanh đỏ
//mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết luận