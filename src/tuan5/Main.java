package tuan5;

import java.sql.*;

/**
 * Quản lý sinh viên
 * Yêu cầu: Sử dụng JTabel và arrayLiat
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        JFrameMain frame = new JFrameMain();
        MySQLConnection connect = new MySQLConnection("localhost", "root", "", "svdb");
        
//         if (connect.getConnect() != null) System.out.println("thanh cong");
//         else System.out.println("that bai");
        
        ResultSet resultSet = connect.excuteQuery("SELECT * FROM sinhvien");
        System.out.println(CountRows(resultSet));
        
        resultSet = connect.excuteQuery("SELECT * FROM sinhvien WHERE MaSV=001");
        System.out.println(CountRows(resultSet));
        
        connect.Close();
    }
    
    //đếm số dòng
    protected static int CountRows(ResultSet resultSet) throws Exception {
        int count = 0;
        while (resultSet.next()) {
            count++;
            System.out.printf(resultSet.getObject("MaSv") + " " + resultSet.getObject("Hovaten"));
        }
        return count;
    }
}
