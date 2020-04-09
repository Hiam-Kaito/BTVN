package tuan3;

import tuan1.*;
import java.util.Scanner;

/**
 * Viết chương trình nhập số tự nhiên N, nhập N phần tử của mảng a, xuất kết quả :<br>
 * a. Các phần tử của mảng a và tổng của chúng<br>
 * b. Các phần tử chẵn của mảng a và tổng của chúng<br>
 * c. Các phần tử lẻ của mảng a và tổng của chúng<br>
 * d. Các phần tử là số nguyên tố của mảng a và tổng của chúng<br>
 * e. Thêm 1 phần tử mới vào mảng<br>
 * f. Xoá phần tử thứ k của mảng a<br>
 * g. nhập 1 số x, kiểm tra x có trong mảng a không, nếu có thì trả về vị trí của<br>
 * x trong mảng a<br>
 */
public class Question8 {
    private int iNumber;
    private int[] iArrays;
    
    private Scanner input = new Scanner(System.in);
    
    public Question8() {
        this.iNumber = 1;
        this.iArrays = new int[1];
    }
    
    public Question8(int iNumber , int[] iArrays) {
        this.iNumber = iNumber;
        setiArrays(iArrays);
    }
    
    /**
     * Kiểm tra tham số truyền vào là kiễu dữ liệu nào
     * @return true nếu là kiểu dữ liệu số nguyên
     */
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
    
    /**
     * Thêm một phần tử vào cuối mảng
     * @param iNumb là giá trị cần thêm
     */
    public void addElement(int iNumb) {
        int iNumber = this.iNumber + 1;
        int[] iArrays = new int[iNumber];
        
        for (int i=0 ; i < this.iNumber ; i++) {
            iArrays[i] = this.iArrays[i];
        }
        
        iArrays[iNumber-1] = iNumb;
        
        this.iNumber++;
        this.iArrays = new int[this.iNumber];
        setiArrays(iArrays);
    }
    
    /**
     * Xóa một phần tử khỏi mảng 
     * @param iPos là vị trí của phần tử đó,<br>
     * <b>iPos</b> phải lớn hơn 1
     */
    public void deleteElement(int iPos) {
        for (int i=iPos - 1 ; i < this.iNumber-1 ; i++) {
            this.iArrays[i] = this.iArrays[i+1];
        }
        
        setiNumber(iNumber-1);
    }
    
    /**
     * Trả về vị trí của số đó bắt đầu từ 1
     * @param iPos là gi
     * @return vị trí của số đó
     * <br>-1 nếu không tìm thấy
     */
    public int findNumber(int iPos) {
        for (int i=0 ; i < this.iNumber ; i++) {
            if ( this.iArrays[i] == iPos )
                return i+1;
        }
        
        return -1;
    }
    
    public int getiNumber() {
        return iNumber;
    }

    public void setiNumber(int iNumber) {
        this.iNumber = iNumber;
    }

    public int[] getiArrays() {
        return iArrays;
    }

    public void setiArrays(int[] iArrays) {
        this.iArrays = iArrays;
    }
    
}
