package com.example.ontap_buoi3.entity;

public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float gia;
    private int soLuong;
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc) {
        setMa(ma);
        setTen(ten);
        setNamBaoHanh(namBaoHanh);
        setGia(gia);
        setSoLuong(soLuong);
        setDanhMuc(danhMuc);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if(ma==null || ma.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong ma");
        }
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten==null || ten.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong ten");
        }
        this.ten = ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        if(String.valueOf(namBaoHanh)==null || String.valueOf(namBaoHanh).trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong namBaoHanh");
        }
        if(namBaoHanh<=0){
            throw new IllegalArgumentException("Nam Bao Hanh > 0");
        }
        this.namBaoHanh = namBaoHanh;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        if(String.valueOf(gia)==null || String.valueOf(gia).trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong gia");
        }
        if(gia<=0){
            throw new IllegalArgumentException("Gia > 0");
        }
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(String.valueOf(soLuong)==null || String.valueOf(soLuong).trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong soLuong");
        }
        if(soLuong<=0){
            throw new IllegalArgumentException("So Luong > 0");
        }
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        if(danhMuc==null || danhMuc.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong danhMuc");
        }
        this.danhMuc = danhMuc;
    }
}
