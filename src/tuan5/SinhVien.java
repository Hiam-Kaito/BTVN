package tuan5;

public class SinhVien {
    private int iMaSv;
    private String strHovaTen;
    private int iNgaySinh;
    private String strGioiTinh;
    private String strDiaChi;

    public SinhVien() {
    }

    public SinhVien(int iMaSv, String strHovaTen, int iNgaySinh, String strGioiTinh, String strDiaChi) {
        this.iMaSv = iMaSv;
        this.strHovaTen = strHovaTen;
        this.iNgaySinh = iNgaySinh;
        this.strGioiTinh = strGioiTinh;
        this.strDiaChi = strDiaChi;
    }

    public void setInfor(int iMasv, String strHovaTen, int iNgaySinh,String strGioiTinh,String strDiaChi) {
        this.iMaSv = iMasv;
        this.strHovaTen = strHovaTen;
        this.iNgaySinh = iNgaySinh;
        this.strGioiTinh = strGioiTinh;
        this.strDiaChi = strDiaChi;
    }
    
    public int getiMaSv() {
        return iMaSv;
    }

    public void setiMaSv(int iMaSv) {
        this.iMaSv = iMaSv;
    }

    public String getStrHovaTen() {
        return strHovaTen;
    }

    public void setStrHovaTen(String strHovaTen) {
        this.strHovaTen = strHovaTen;
    }

    public int getiNgaySinh() {
        return iNgaySinh;
    }

    public void setiNgaySinh(int iNgaySinh) {
        this.iNgaySinh = iNgaySinh;
    }

    public String getStrGioiTinh() {
        return strGioiTinh;
    }

    public void setStrGioiTinh(String strGioiTinh) {
        this.strGioiTinh = strGioiTinh;
    }

    public String getStrDiaChi() {
        return strDiaChi;
    }

    public void setStrDiaChi(String strDiaChi) {
        this.strDiaChi = strDiaChi;
    }
    
    
}
