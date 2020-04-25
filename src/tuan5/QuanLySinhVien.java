package tuan5;

import java.util.*;
import java.sql.*;

public class QuanLySinhVien {
    List<SinhVien> list_sv;
    private MySQLConnection connect;
    private ResultSet resultSet;
    private Statement statement;
    
    public QuanLySinhVien() throws Exception {
        list_sv = new ArrayList<>();
        ketNoiSql();
    }

    public QuanLySinhVien(List<SinhVien> list_sv) {
        this.list_sv = list_sv;
    }

    private void ketNoiSql() throws Exception {
        connect = new MySQLConnection("localhost", "root", "", "svdb");
        
        resultSet = connect.excuteQuery("SELECT * FROM sinhvien");
        
        statement = connect.getStatement();
        
        while (resultSet.next()) {
            SinhVien sv = new SinhVien();
            sv.setiMaSv( (Integer) resultSet.getObject("MaSV") );
            sv.setStrHovaTen( (String) resultSet.getObject("HovaTen"));
            sv.setiNgaySinh( (Integer) resultSet.getObject("NgaySinh"));
            sv.setStrGioiTinh( (String) resultSet.getObject("GioiTinh") );
            sv.setStrDiaChi( (String) resultSet.getObject("DiaChi"));
            
            add(sv);
        }
    }
    
    public void createSV(SinhVien sv, String Query) throws Exception {
        statement.executeUpdate(Query);
        add(sv);
//        System.out.println( connect.excuteUpdate(Query) );
    }
    
    public boolean deleteSV(int iMasv, String Query) throws Exception {
        for (Iterator<SinhVien> i = list_sv.iterator(); i.hasNext() ;) {
            SinhVien sv = i.next();
            if (sv.getiMaSv() == iMasv) {
                i.remove();
                statement.executeUpdate(Query);
                return true;
            }
        }
        return false;
    }
    
    public SinhVien getInforbyMasv(int iMasv) {
        for (Iterator<SinhVien> i = list_sv.iterator(); i.hasNext() ;) {
            SinhVien sv = i.next();
            if (sv.getiMaSv() == iMasv) {
                return sv;
            }
        }
        return null;
    }
    
    public SinhVien getInfor(int iPos) {
        SinhVien sv = new SinhVien();
        sv = list_sv.get(iPos);
        return sv;
    }
    
    public int getSoSinhVien() {
        int count = 0;
        for (SinhVien a : list_sv) {
            count++;
        }
        return count;
    }
    
    public void add(SinhVien sv) {
        list_sv.add(sv);
    }
    
    public boolean check_existId(int id){
        for (Iterator<SinhVien> it = list_sv.iterator(); it.hasNext();) {
            SinhVien e = it.next();
            if(e.getiMaSv() == id){
                return true;
            }
        }
        return false;
    }
    
    public List<SinhVien> getList_sv() {
        return list_sv;
    }

    public void setList_sv(List<SinhVien> list_sv) {
        this.list_sv = list_sv;
    }
    
}
