package tuan2;

import java.util.Scanner;

//  Thiết kế class HINHCHUNHAT bao gồm các thuộc tính chiều dài, chiều rộng,
//  các phương thức nhập/xuất/tính diện tích/tính chu vi hình chữ nhật
public class RECTANGLE {
    private int iLength;
    private int iWitdh;
    
    private Scanner input = new Scanner(System.in);

    public RECTANGLE() {
        this.iLength = 1;
        this.iWitdh = 1;
    }

    public RECTANGLE(int iLength, int iWitdh) {
        this.iLength = iLength;
        this.iWitdh = iWitdh;
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
    
    public void getLengthWitdh(int iLength, int iWitdh) {
        this.iLength = iLength;
        this.iWitdh = iWitdh;
    }

    public void getLengthWitdh() {
        String str;
        
        do {
            System.out.print("Nhập chieu dai: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        setiLength(Integer.parseInt(str) );
        
        do {
            System.out.print("Nhập chieu rong: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        setiWitdh(Integer.parseInt(str) );
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

    @Override
    public String toString() {
        return "RECTANGLE{" + "iLength=" + iLength + ", iWitdh=" + iWitdh + '}';
    }
    
}
