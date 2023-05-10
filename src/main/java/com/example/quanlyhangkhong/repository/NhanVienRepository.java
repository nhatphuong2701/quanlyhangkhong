package com.example.quanlyhangkhong.repository;


import com.example.quanlyhangkhong.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    @Query(value = "select nv.ten from NhanVien nv where nv.luong = :luongnhanvien")
    List<String> timBoiLuong(Long luongnhanvien);

    @Query(value = "SELECT nv FROM NhanVien nv JOIN ChungNhan cn ON cn.nhanVien.maNV = nv.maNV WHERE cn.mayBay.maMB = ?1")
    List<NhanVien> timNhanVienLaiMayBay747(Long maMayBay);

    @Query(value = "SELECT SUM(nv.luong) FROM NhanVien nv where nv.maNV IN (SELECT DISTINCT cn.nhanVien.maNV FROM ChungNhan cn)")
    Long timTongLuongPhiCong();
}
