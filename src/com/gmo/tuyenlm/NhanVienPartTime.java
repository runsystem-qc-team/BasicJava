package com.gmo.tuyenlm;

public class NhanVienPartTime extends NhanVien {
	private int gioLamViec; // Tổng số giờ làm việc của nhân viên
    
    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
     
    @Override
    public String loaiNhanVien() {
        return "Nhân viên thời vụ";
    }
     
    @Override
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}
