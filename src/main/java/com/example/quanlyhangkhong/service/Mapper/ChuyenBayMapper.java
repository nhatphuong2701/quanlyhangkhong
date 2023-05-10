package com.example.quanlyhangkhong.service.Mapper;

import com.example.quanlyhangkhong.entity.ChuyenBay;
import com.example.quanlyhangkhong.service.dto.ChuyenBayDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChuyenBayMapper {
    ChuyenBayMapper CHUYEN_BAY_MAPPER = Mappers.getMapper(ChuyenBayMapper.class);

    ChuyenBayDTO toDto (ChuyenBay chuyenBay);

    List<ChuyenBayDTO> toDtos (List<ChuyenBay> chuyenBays);
}
