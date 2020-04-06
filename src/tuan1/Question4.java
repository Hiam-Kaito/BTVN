package tuan1;

import java.util.Scanner;

//  Viết chương trình nhập số nguyên N, 
//  kiểm tra và xuất kết quả N là số chẵn/lẻ
public class Question4 {
    private int iNumber;
    
    private Scanner input = new Scanner(System.in);
    
    public Question4() {
        this.iNumber = 1;
    }
    
    public Question4(int iNumber) {
        this.iNumber = iNumber;
    }
    
    // return true if it is Integer
    public static boolean isInteger(String var) {
        try {  
            Integer.parseInt(var);  
            return true;
        
        // return false when "var" can't be converted to integer    
        // NumberFormatException will return null
        } catch(NumberFormatException e){  
            return false;  
        }
    }
    
    public boolean isEvenNumber() {
        if ( this.iNumber % 2 == 0 )
            return true;
        return false;
    }
    
    public int getiNumber() {
        return iNumber;
    }

    public void setiNumber(int iNumber) {
        this.iNumber = iNumber;
    } 
}
