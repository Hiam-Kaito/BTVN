package tuan1;

import java.util.Scanner;

//  Viết chương trình nhập bán kính hình tròn, 
//  xuất chu vi, diện tích của hình tròn đó.
public class Question3 {
    private double dRadius;
    
    private Scanner input = new Scanner(System.in);
    
    public Question3() {
        this.dRadius = 1;
    }
    
    public Question3(double dRadius) {
        this.dRadius = dRadius;
    }

    // return true if it is Double
    public static boolean isNumeric(String var) {
        try {  
            Double.parseDouble(var);  
            return true;
        
        // return false when "var" can't be converted to double    
        // NumberFormatException will return null
        } catch(NumberFormatException e){  
            return false;  
        }
    }
    
    // 2 * R * pi
    public double circumference() {
        return 2 * this.dRadius * 3.14;
    }
    
    // R * R * pi
    public double area() {
        return this.dRadius * this.dRadius * 3.14;
    }
    
    public double getdRadius() {
        return dRadius;
    }

    public void setdRadius(double dRadius) {
        this.dRadius = dRadius;
    }
    
}
