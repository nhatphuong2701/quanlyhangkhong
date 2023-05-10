package com.example.quanlyhangkhong.service.Mapper;

import com.example.quanlyhangkhong.entity.MayBay;
import com.example.quanlyhangkhong.service.dto.MayBayDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MayBayMapper {
    MayBayMapper MAY_BAY_MAPPER = Mappers.getMapper(MayBayMapper.class);

    MayBayDTO toDto (MayBay mayBay);

    List<MayBayDTO> toDtos (List<MayBay> mayBays);
}
