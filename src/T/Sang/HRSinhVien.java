package T.Sang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HRSinhVien {
    private List<SinhVien> list_sv;     
    public HRSinhVien() {
        list_sv = new ArrayList<>();
    }

    public HRSinhVien(List<SinhVien> list_sv) {
        this.list_sv = list_sv;
    }
    
    public void add(SinhVien sv) {
        list_sv.add(sv);
    }
    
    public int getSoSinhVien() {
        int count = 0;
        for (SinhVien a : list_sv) {
            count++;
        }
        return count;
    }
    
    public SinhVien getInfor(int iPos) {
        SinhVien sv = new SinhVien();
        sv = list_sv.get(iPos);
        return sv;
    }
    
    public boolean createSV(SinhVien sv) {
        // hàm kiểm tra sự duy nhất ID:
        if (check_existId(sv.getMaSV())) 
            return false;
        //
        add(sv);
        return true;
    }
    
    public boolean deleteSV(String iMasv) {
        for (Iterator<SinhVien> i = list_sv.iterator(); i.hasNext() ;) {
            SinhVien sv = i.next();
            if (sv.getMaSV()== iMasv) {
                i.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean updateSV(String iMasv, SinhVien Sinhvien) {
        for (Iterator<SinhVien> i = list_sv.iterator() ; i.hasNext() ; ) {
            SinhVien sv = i.next();
            if (sv.getMaSV() == iMasv) {
                return true;
            }
        }
        return false;
    }
    
    public boolean check_existId(String id){
        for (Iterator<SinhVien> it = list_sv.iterator(); it.hasNext();) {
            SinhVien e = it.next();
            if(e.getMaSV() == id){
                return true;
            }
        }
        return false;
    }
}
