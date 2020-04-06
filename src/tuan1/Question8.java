package tuan1;

import java.util.Scanner;

//  Viết chương trình nhập số tự nhiên N, nhập N phần tử của mảng a, xuất kết quả :
//  a. Các phần tử của mảng a và tổng của chúng
//  b. Các phần tử chẵn của mảng a và tổng của chúng
//  c. Các phần tử lẻ của mảng a và tổng của chúng
//  d. Các phần tử là số nguyên tố của mảng a và tổng của chúng
//  e. Thêm 1 phần tử mới vào mảng
//  f. Xoá phần tử thứ k của mảng a
//  g. nhập 1 số x, kiểm tra x có trong mảng a không, nếu có thì trả về vị trí của
//  x trong mảng a
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
    
    // get number
    public void getNumb() {
        String str;
        
        do {
            System.out.print("Enter the number of arrays: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        setiNumber( Integer.parseInt(str) );
        
        this.iArrays = new int[ this.iNumber ];
        
        for (int i=0 ; i< this.iNumber ; i++) {
            
            do {
            System.out.printf("A[%d]: ",i);
            str = input.nextLine();
            } while ( !isInteger(str) );
        
            this.iArrays[i] = Integer.parseInt(str);        
        }
    }
    
    public void sum() {
        int iSum = 0;
        
        System.out.println("All number: ");
        for (int i=0 ; i < this.iNumber ; i++) {
            System.out.printf(this.iArrays[i] + " ");
            iSum += this.iArrays[i];
        }
        System.out.println("\nSum: " + iSum);
    }

    public void sumEvenNumber() {
        int iSum = 0;
        
        System.out.println("Even number: ");
        for (int i=0 ; i < this.iNumber ; i++) {

            if ( isEvenNumber(this.iArrays[i] ) ) {
                System.out.print(this.iArrays[i] + " ");
                iSum += this.iArrays[i];
            }
        }
        System.out.println("\nSum Even Nember is: " + iSum);
    }
    
    public void sumPrimeNumber() {
        int iSum = 0;
        
        System.out.println("Prime number: ");
        for (int i=0 ; i < this.iNumber ; i++) {

            if ( isPrimeNumber(this.iArrays[i]) ) {
                System.out.print(this.iArrays[i] + " ");
                iSum += this.iArrays[i];
            }
        }
        System.out.println("\nSum Prime Nember is: " + iSum);
    }
    
    public boolean isEvenNumber(int iNumber) {
        if ( iNumber % 2 == 0 )
            return true;
        return false;
    }
    
    public boolean isPrimeNumber(int iNumber) {
	if( iNumber < 2 )
            return false;
	
        for(int i = 2 ; i <= iNumber / 2 ; i++)
            if( iNumber % i == 0 )
                return false;
	
        return true;
    }
    
    public void export() {
        for (int i=0 ; i < this.iNumber ; i++) {
            System.out.printf(this.iArrays[i] + " ");
        }
    }
    
    public void addElement() {
        String str;
        int iNumber = this.iNumber + 1;
        int[] iArrays = new int[iNumber];
        
        do {
            System.out.print("Enter number: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        for (int i=0 ; i < this.iNumber ; i++) {
            iArrays[i] = this.iArrays[i];
        }
        
        iArrays[iNumber-1] = Integer.parseInt(str);
        
        this.iNumber++;
        this.iArrays = new int[this.iNumber];
        setiArrays(iArrays);
        
        export();
    }
    
    public void deleteElement() {
        String str;
        int iPos;
        
        do {
            System.out.print("Enter number k: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        iPos = Integer.parseInt(str);
        
        for (int i=iPos - 1 ; i < this.iNumber-1 ; i++) {
            this.iArrays[i] = this.iArrays[i+1];
        }
        
        setiNumber(iNumber-1);
        
        export();
    }
    
    public int findNumber() {
        String str;
        int iPos;
        
        do {
            System.out.print("Enter number x: ");
            str = input.nextLine();
        } while ( !isInteger(str) );
        
        iPos = Integer.parseInt(str);
        
        for (int i=0 ; i < this.iNumber ; i++) {
            
            if ( this.iArrays[i] == iPos )
                return i+1;
        }
        
        return -1;
    }
    
    public void menu() {
        String str;
        int ikey;
        
        do {

            do {
                System.out.printf("Please choice:   \n"
                        + "1. Các phần tử của mảng a và tổng của chúng\n"
                        + "2. Các phần tử chẵn của mảng a và tổng của chúng\n"
                        + "3. Các phần tử là số nguyên tố của mảng a và tổng của chúng\n"
                        + "4. Thêm 1 phần tử mới vào mảng\n"
                        + "5. Xoá phần tử thứ k của mảng a\n"
                        + "6. nhập 1 số x, kiểm tra x có trong mảng a không, nếu có thì trả về vị trí của\n" +
"x trong mảng a\n");

                str = input.nextLine();
            } while ( !isInteger(str) );

            ikey = Integer.parseInt(str);

        } while ( ikey <1 || ikey >6 );
        
        switch ( ikey ) {
            case 1:
                sum();
                break;
            case 2:
                sumEvenNumber();
                break;
            case 3:
                sumPrimeNumber();
                break;
            case 4:
                addElement();
                break;
            case 5:
                deleteElement();
                break;    
            case 6:
                int k = findNumber();
                
                if (k != -1 )
                    System.out.println("Vi tri so do la: "+ k);
                else
                    System.out.println("khong tim thay");
                
                break;
        }
    }
    
    
    public void program() {
        String str = "yes";
        
        getNumb();
        
        do {
            menu();
            
            System.out.print("\nDo you want to do it again?\n");
            str = input.nextLine();
            str = str.toLowerCase();
        } while ( str.equals("yes") );
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
