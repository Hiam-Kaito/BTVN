package tuan1;

import java.util.Scanner;

//Viết chương trình nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.
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
    
    // sum of number 1 and number 2
    public int sum() {
        return this.iNumbOne + this.iNumbTwo;
    }
    
    // difference of number 1 and number 2
    public int difference() {
        return this.iNumbOne - this.iNumbTwo;
    }	
    
    // product of number 1 and number 2
    public int product(){
        return this.iNumbOne * this.iNumbTwo;
    }
    
    // quotient of number 1 and number 2
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
