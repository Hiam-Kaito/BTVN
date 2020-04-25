package tuan5;

public class MonHoc {
    private int iMaMonHoc;
    private String strTenMonhoc;
    private int iSoTinChi;

    public MonHoc() {
    }

    public MonHoc(int iMaMonHoc, String strTenMonhoc, int iSoTinChi) {
        this.iMaMonHoc = iMaMonHoc;
        this.strTenMonhoc = strTenMonhoc;
        this.iSoTinChi = iSoTinChi;
    }

    public int getiMaMonHoc() {
        return iMaMonHoc;
    }

    public void setiMaMonHoc(int iMaMonHoc) {
        this.iMaMonHoc = iMaMonHoc;
    }

    public String getStrTenMonhoc() {
        return strTenMonhoc;
    }

    public void setStrTenMonhoc(String strTenMonhoc) {
        this.strTenMonhoc = strTenMonhoc;
    }

    public int getiSoTinChi() {
        return iSoTinChi;
    }

    public void setiSoTinChi(int iSoTinChi) {
        this.iSoTinChi = iSoTinChi;
    }
    
    
}
