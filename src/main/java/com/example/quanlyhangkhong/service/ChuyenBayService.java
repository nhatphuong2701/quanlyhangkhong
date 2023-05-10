package com.example.quanlyhangkhong.service;

import com.example.quanlyhangkhong.entity.ChuyenBay;
import com.example.quanlyhangkhong.repository.ChuyenBayRepository;
import com.example.quanlyhangkhong.service.Mapper.ChuyenBayMapper;
import com.example.quanlyhangkhong.service.dto.ChuyenBayDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@RequiredArgsConstructor
public class ChuyenBayService {
    private final ChuyenBayRepository chuyenBayRepository;
    public List<ChuyenBayDTO> getAllChuyenBay() {
        return ChuyenBayMapper.CHUYEN_BAY_MAPPER.toDtos(chuyenBayRepository.findAll());
    }

    public ChuyenBayDTO getChuyenbayByMaCB(String maCB) {
        return ChuyenBayMapper.CHUYEN_BAY_MAPPER.toDto(chuyenBayRepository.findById(maCB).get());
    }
    public List<ChuyenBayDTO> findByGaDi(String gaDi) {
        return ChuyenBayMapper.CHUYEN_BAY_MAPPER.toDtos(chuyenBayRepository.findByGaDi(gaDi));
    }

    public List<ChuyenBayDTO> findByChiPhiLessThan(Long chiPhi) {
        return ChuyenBayMapper.CHUYEN_BAY_MAPPER.toDtos(chuyenBayRepository.findByChiPhiLessThan(chiPhi));
    }

    public  List<ChuyenBayDTO> chuyenBayGaDen(String gaden){
        return ChuyenBayMapper.CHUYEN_BAY_MAPPER.toDtos(chuyenBayRepository.chuyenBayGaDen(gaden));
    }

}
