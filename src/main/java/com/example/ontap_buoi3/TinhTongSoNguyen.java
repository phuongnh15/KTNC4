package com.example.ontap_buoi3;

public class TinhTongSoNguyen {
    public int tinhTongSoLe(int n){
        if(String.valueOf(n)==null || String.valueOf(n).trim().isEmpty()){
            throw new IllegalArgumentException("Khong duoc null");
        }
        if(String.valueOf(n).matches("[a-zA-z]+")){
            throw new IllegalArgumentException("Phai nhap dang so");
        }
        if (n<=0){
            throw new IllegalArgumentException("Nhap so > 0");
        }

        int tong = 0;

        for (int i = 1;i<=n;i++){
            if(i % 2 != 0){
                tong+=i;
            }
        }
        return tong;
    }
}
