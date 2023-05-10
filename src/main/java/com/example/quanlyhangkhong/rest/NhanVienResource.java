package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.NhanVien;
import com.example.quanlyhangkhong.exception.DemoException;
import com.example.quanlyhangkhong.service.NhanVienService;
import com.example.quanlyhangkhong.service.dto.NhanVienDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class NhanVienResource implements NhanVienAPI{
    private final NhanVienService nhanVienService;
    @Override
    public ResponseEntity<List<String>> timBoiLuong(Long luongnhanvien) {
        return ResponseEntity.ok(nhanVienService.timBoiLuong(luongnhanvien));
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> timNhanVienLaiMayBay747(Long maMayBay) {
        return ResponseEntity.ok(nhanVienService.timNhanVienLaiMayBay747(maMayBay));

    }

    @Override
    public ResponseEntity<Long> timTongLuongPhiCong() {
        return ResponseEntity.ok(nhanVienService.timTongLuongPhiCong());
    }

    @Override
    public ResponseEntity<NhanVienDTO> timBoiMaNV(Long maNV) {
        return ResponseEntity.ok(nhanVienService.timBoiMaNV(maNV));
    }
}
