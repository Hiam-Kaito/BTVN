package tuan5;

public class Diem {
    private int iMaSv;
    private int iMaMonHoc;
    private double dDiem;

    public Diem() {
    }

    public Diem(int iMaSv, int iMaMonHoc, double dDiem) {
        this.iMaSv = iMaSv;
        this.iMaMonHoc = iMaMonHoc;
        this.dDiem = dDiem;
    }

    public int getiMaSv() {
        return iMaSv;
    }

    public void setiMaSv(int iMaSv) {
        this.iMaSv = iMaSv;
    }

    public int getiMaMonHoc() {
        return iMaMonHoc;
    }

    public void setiMaMonHoc(int iMaMonHoc) {
        this.iMaMonHoc = iMaMonHoc;
    }

    public double getdDiem() {
        return dDiem;
    }

    public void setdDiem(double dDiem) {
        this.dDiem = dDiem;
    }
    
    
}
