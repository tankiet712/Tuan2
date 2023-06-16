package Bai2;

public class SinhVien {
	private int maSV;
    private String tenSV;
    private float diemTL, diemTH;
 
    //khởi tạo constructor không tham số
    public SinhVien() {
    }
 
    //khởi tạo constructor có tham số
    public SinhVien(int maSV, String tenSV, Float diemTL, Float diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTH = diemTH;
        this.diemTL = diemTL;
    }
 
    //begin getter and setter
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getTenSV() {
        return tenSV;
    }
 
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
 
    public float getDiemTL() {
        return diemTL;
    }
 
    public void setDiemTL(float diemTL) {
        this.diemTL = diemTL;
    }
 
    public float getDiemTH() {
        return diemTH;
    }
 
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    //tạo hàm tính điểm trung bình
    public float tinhDiemTB() {
        return (diemTH + diemTL) / 2;
    }
 
    //sử dụng phương thức toString để hiển thị kết quả
    public String toString() {
        return maSV + " - " + tenSV + " diem Tb : " + tinhDiemTB();
    }
public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, tenSV, diemTH, diemTL, tinhDiemTB());
    }
}