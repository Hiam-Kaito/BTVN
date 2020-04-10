package tuan3;

import java.util.Scanner;

/**
 * Viết chương trình nhập số tự nhiên N, 
 * kiểm tra và xuất kết quả N là số nguyên tố hay không.
 */
public class Question6 {
    private int iNumber;
    
    private Scanner input = new Scanner(System.in);
    
    public Question6() {
        this.iNumber = 1;
    }
    
    public Question6(int iNumber) {
        this.iNumber = iNumber;
    }
    
    /**
     * Kiểm tra tham số truyền vào là kiễu dữ liệu nào
     * @return true nếu là kiểu dữ liệu số nguyên
     */
    public boolean isInteger(String var) {
        try {  
            Integer.parseInt(var);  
            return true;
        
        // return false when "var" can't be converted to integer    
        // NumberFormatException will return null
        } catch(NumberFormatException e){  
            return false;  
        }
    }
    
    public boolean isPrimeNumber() {
	if( this.iNumber < 2 )
            return false;
	
        for(int i = 2 ; i <= this.iNumber / 2 ; i++)
            if( this.iNumber % i == 0 )
                return false;
	
        return true;
    }
    
    public int getiNumber() {
        return iNumber;
    }

    public void setiNumber(int iNumber) {
        this.iNumber = iNumber;
    }
}
