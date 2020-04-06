package tuan2;

import java.util.Scanner;

//  Thiết kế class DIEM (2 chiều) bao gồm các thuộc tính tọa độ x,y, 
//  các phương thức nhập/ xuất/di chuyển điểm.
public class POINT {
    // tọa độ của điểm
    private int iX;
    private int iY;
    
    private Scanner input = new Scanner(System.in);

    public POINT() {
        this.iX = 1;
        this.iY = 1;
    }

    public POINT(int iX, int iY) {
        this.iX = iX;
        this.iY = iY;
    }

    public double distance(int iX, int iY){
        POINT res = new POINT();
        res.iX = iX;
        res.iY = iY;
        return distance(res);
    }
    
    public double distance(POINT point){
        return Math.sqrt( (this.iX - point.iX) * (this.iX - point.iX)
                + (this.iY - point.iY) * (this.iY - point.iY) );
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
    
    public int getiX() {
        return iX;
    }

    public void setiX(int iX) {
        this.iX = iX;
    }

    public int getiY() {
        return iY;
    }

    public void setiY(int iY) {
        this.iY = iY;
    }

    public void getXY(int iX, int iY) {
        this.iX = iX;
        this.iY = iY;
    }
    
    public void getXY() {
        String str;
        
        do {
            System.out.print("Nhập X: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        setiX( Integer.parseInt(str) );
        
        do {
            System.out.print("Nhập Y: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        setiY( Integer.parseInt(str) );
    }
    
    @Override
    public String toString() {
        return "MyPoint{" + "X=" + iX + ", Y=" + iY + '}';
    }
    
}
