package com.example.ontap_buoi3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoNguyenTest {
    private TinhTongSoNguyen tinhTongSoNguyen;

    @BeforeEach
    void setUp(){
        tinhTongSoNguyen = new TinhTongSoNguyen();
    }
    @Test
    void testSoHopLe() {
        Assertions.assertEquals(25,tinhTongSoNguyen.tinhTongSoLe(10));
    }

    @Test
    void testSoNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTongSoNguyen.tinhTongSoLe(Integer.valueOf(null)));
    }

    @Test
    void testSoNhapKhongLaSo(){
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTongSoNguyen.tinhTongSoLe(Integer.valueOf("abc")));
    }

    @Test
    void testSoAm(){
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTongSoNguyen.tinhTongSoLe(-2));
    }

    @Test
    void testKetQuaFalse(){
        Assertions.assertNotEquals(12,tinhTongSoNguyen.tinhTongSoLe(10));
    }
}