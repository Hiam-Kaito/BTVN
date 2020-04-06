package tuan1;

import java.util.Scanner;

//  Viết chương trình nhập số tự nhiên N, xuất kết quả :
//  a. Các số tự nhiên <=N và tổng của chúng
//  b. Các số tự nhiên chẵn <=N và tổng của chúng
//  c. Các số tự nhiên lẻ <=N và tổng của chúng
//  d. Các số tự nhiên là số nguyên tố <=N và tổng của chúng
//  e. N số nguyên tố đầu tiên
public class Question7 {
    private int iNumber;
    
    private Scanner input = new Scanner(System.in);
    
    public Question7() {
        this.iNumber = 1;
    }
    
    public Question7(int iNumber) {
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
    
    /**
     * 
     * @param iNumber
     * @return true nếu là số chẵn
     */
    public boolean isEvenNumber(int iNumber) {
        if ( iNumber % 2 == 0 )
            return true;
        return false;
    }
    
    /**
     * 
     * @param iNumber
     * @return true nếu là số nguyên tố
     */
    public boolean isPrimeNumber(int iNumber) {
	if( iNumber < 2 )
            return false;
	
        for(int i = 2 ; i <= iNumber / 2 ; i++)
            if( iNumber % i == 0 )
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
