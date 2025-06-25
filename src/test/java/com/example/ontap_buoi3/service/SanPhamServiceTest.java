package com.example.ontap_buoi3.service;

import com.example.ontap_buoi3.entity.SanPham;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService sanPhamService;

    @BeforeEach
    void setUp(){
        sanPhamService = new SanPhamService();
    }

    @Test
    void testAddSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertEquals(1,sanPhamService.getAll().size());
    }

    @Test
    void testAddWithMaNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("","Banh gao",1,12000f,12,"Banh")));
    }

    @Test
    void getOneSanPham() {
    }

    @Test
    void testUpdateSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        sanPham.setTen("Banh gao vi ngo");
        sanPham.setNamBaoHanh(2);
        sanPham.setGia(15000f);
        sanPhamService.updateSanPham(sanPham);

        assertEquals("Banh gao vi ngo",sanPhamService.getOneSanPham("SP1").getTen());
        assertEquals(2,sanPhamService.getOneSanPham("SP1").getNamBaoHanh());
        assertEquals(15000,sanPhamService.getOneSanPham("SP1").getGia());
    }

    @Test
    void testUpdateTen_null(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","",1,12000f,12,"Banh")));
    }

    @Test
    void testUpdateNamBHKhongHopLe(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Banh gao",Integer.valueOf(null),12000f,12,"Banh")));
    }

    @Test
    void testUpdateNamBHAm(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Banh gao",-2,12000f,12,"Banh")));
    }

    @Test
    void testUpdateGiaKhongHopLe(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Banh gao",1,-1000,12,"Banh")));
    }

    @Test
    void testUpdateSoLuongKhongHopLe(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Banh gao",1,1000,-2,"Banh")));
    }

    @Test
    void testUpdateDanhMucKhongHopLe(){
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Banh gao",1,1000,2,"")));
    }
    @Test
    void deleteSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        sanPhamService.deleteSanPham("SP1");

        Assertions.assertNull(sanPhamService.getOneSanPham("SP1"));
    }

    @Test
    void deleteSanPhamMaNull() {
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.deleteSanPham(null));
    }

    @Test
    void deleteSanPhamWithMaKhac() {
        SanPham sanPham = new SanPham("SP1","Banh gao",1,12000f,12,"Banh");
        sanPhamService.addSanPham(sanPham);

        sanPhamService.deleteSanPham("SP2");

        Assertions.assertNotNull(sanPhamService.getOneSanPham("SP1"));
    }

    @Test
    void getAll() {
    }
}