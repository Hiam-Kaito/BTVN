package tuan3;

import java.util.Scanner;

/**
 * Viết chương trình nhập số tự nhiên N, xuất kết quả :<br>
 * a. Các số tự nhiên &lt;=N và tổng của chúng<br>
 * b. Các số tự nhiên chẵn &lt;=N và tổng của chúng<br>
 * c. Các số tự nhiên lẻ &lt;=N và tổng của chúng<br>
 * d. Các số tự nhiên là số nguyên tố &lt;=N và tổng của chúng<br>
 * e. N số nguyên tố đầu tiên<br>
 */
public class Question7 {
    private int iNumber;
    
    private Scanner input = new Scanner(System.in);
    
    public Question7() {
        this.iNumber = 1;
    }
    
    public Question7(int iNumber) {
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
    
    /**
     * kiểm sự chẵn lẻ của số đầu vào
     * @return là số chẵn
     */
    public boolean isEvenNumber(int iNumber) {
        if ( iNumber % 2 == 0 )
            return true;
        return false;
    }
    
    /**
     * 
     * kiểm tra xem đó có phải là số nguyên tố hay không
     * @return true là số nguyên tố
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
