package tuan3;

import java.util.Scanner;

/**
 * Viết chương trình nhập chiều dài, chiều rộng hình chữ nhật, xuất chu vi, diện tích
 * của hình chữ nhật đó.
 */
public class Question2 {
    private int iLength;
    private int iWitdh;
    
    private Scanner input = new Scanner(System.in);
    
    public Question2() {
        this.iLength = 1;
        this.iWitdh = 1;
    }
    
    public Question2(int iLength, int iWitdh) {
       this.iLength = iLength;
       this.iWitdh = iWitdh;
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
    
    // retangle have length > witdh
    public boolean isRectangle() {
        if ( this.iLength > this.iWitdh )
            return true;
        return false;
    }
    
    public int circumference() {
        return ( this.iLength + this.iWitdh ) * 2;
    }
    
    public int area() {
        return this.iLength * this.iWitdh;
    }
    
    public int getiLength() {
        return iLength;
    }

    public void setiLength(int iLength) {
        this.iLength = iLength;
    }

    public int getiWitdh() {
        return iWitdh;
    }

    public void setiWitdh(int iWitdh) {
        this.iWitdh = iWitdh;
    }

}
