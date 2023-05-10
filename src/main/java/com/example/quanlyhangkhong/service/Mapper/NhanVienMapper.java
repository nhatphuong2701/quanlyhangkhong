package com.example.quanlyhangkhong.service.Mapper;

import com.example.quanlyhangkhong.entity.NhanVien;
import com.example.quanlyhangkhong.service.dto.NhanVienDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NhanVienMapper {
    NhanVienMapper NHAN_VIEN_MAPPER = Mappers.getMapper(NhanVienMapper.class);

    NhanVienDTO toDto (NhanVien nhanVien);

    List<NhanVienDTO> toDtos (List<NhanVien> nhanViens);
}
