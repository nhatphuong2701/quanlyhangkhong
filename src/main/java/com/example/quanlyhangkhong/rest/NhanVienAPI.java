package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.NhanVien;
import com.example.quanlyhangkhong.service.dto.NhanVienDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = ("/api/nhanvien"))

public interface NhanVienAPI {
    @GetMapping("/{manv}")
    ResponseEntity<NhanVienDTO> timBoiMaNV(@PathVariable("manv") Long maNV);

    @GetMapping("/tim_boi_luong")
    ResponseEntity<List<String>> timBoiLuong(@RequestParam("luongnhanvien") Long luongnhanvien);

    @GetMapping("/lai_may_bay_747")
    ResponseEntity<List<NhanVienDTO>> timNhanVienLaiMayBay747(@RequestParam("maMayBay") Long maMayBay);

    @GetMapping("/tim_tong_luong_phi_cong")
    ResponseEntity<Long> timTongLuongPhiCong();
}
