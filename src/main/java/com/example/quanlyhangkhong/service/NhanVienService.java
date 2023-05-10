package com.example.quanlyhangkhong.service;

import com.example.quanlyhangkhong.entity.NhanVien;
import com.example.quanlyhangkhong.exception.DemoException;
import com.example.quanlyhangkhong.repository.NhanVienRepository;
import com.example.quanlyhangkhong.service.Mapper.NhanVienMapper;
import com.example.quanlyhangkhong.service.dto.NhanVienDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NhanVienService {
    private final NhanVienRepository nhanVienRepository;

    public List<String> timBoiLuong(Long luongnhanvien) {
        return nhanVienRepository.timBoiLuong(luongnhanvien);
    }

    public List<NhanVienDTO> timNhanVienLaiMayBay747(Long maMayBay){
        return NhanVienMapper.NHAN_VIEN_MAPPER.toDtos(nhanVienRepository.timNhanVienLaiMayBay747(maMayBay));
    }

    public Long timTongLuongPhiCong(){
        return nhanVienRepository.timTongLuongPhiCong();
    }

    public NhanVienDTO timBoiMaNV(Long maNV) {
        return NhanVienMapper.NHAN_VIEN_MAPPER.toDto(nhanVienRepository.findById(maNV).orElseThrow(DemoException::DepartmentNotFound));
    }
}
