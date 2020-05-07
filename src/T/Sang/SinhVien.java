package T.Sang;

public class SinhVien {
    private String MaSV;
    private String HovaTen;
    private String NamSinh;
    private String DiaChi;
    private String DienThoai;
    private String Hinh;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String HovaTen, String NamSinh, String DiaChi, String DienThoai) {
        this.MaSV = MaSV;
        this.HovaTen = HovaTen;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
    }
    
    public void setInfor() {
        
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    
    
}
