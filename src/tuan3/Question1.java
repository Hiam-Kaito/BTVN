package tuan3;

import java.util.Scanner;

/**
 * Viết chương trình nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.
 */
public class Question1 {
    private int iNumbOne;
    private int iNumbTwo;

    private Scanner input = new Scanner(System.in);
    
    public Question1() {
        this.iNumbTwo = 1;
        this.iNumbOne = 1;
    }
    
    public Question1(int iNumbOne , int iNumbTwo) {
        this.iNumbTwo = iNumbOne;
        this.iNumbTwo = iNumbTwo;
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
    
    public int sum() {
        return this.iNumbOne + this.iNumbTwo;
    }
    
    public int difference() {
        return this.iNumbOne - this.iNumbTwo;
    }	
    
    public int product(){
        return this.iNumbOne * this.iNumbTwo;
    }
    
    public double quotient(){
        return this.iNumbOne / this.iNumbTwo;
    }
    
    public int getiNumbOne() {
        return iNumbOne;
    }

    public int getiNumbTwo() {
        return iNumbTwo;
    }

    public void setiNumbTwo(int iNumbTwo) {
        this.iNumbTwo = iNumbTwo;
    }

    public void setiNumbOne(int iNumbOne) {
        this.iNumbOne = iNumbOne;
    }
    
}
