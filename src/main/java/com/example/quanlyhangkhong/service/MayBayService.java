package com.example.quanlyhangkhong.service;

import com.example.quanlyhangkhong.entity.MayBay;
import com.example.quanlyhangkhong.repository.MayBayRepository;
import com.example.quanlyhangkhong.service.Mapper.MayBayMapper;
import com.example.quanlyhangkhong.service.dto.MayBayDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MayBayService {
    private final MayBayRepository mayBayRepository;
    public List<MayBayDTO>getAllMayBay() {
        return MayBayMapper.MAY_BAY_MAPPER.toDtos(mayBayRepository.findAll());
    }

    public List<MayBayDTO>findByTamBayLessThan(Long tamBay) {
        return MayBayMapper.MAY_BAY_MAPPER.toDtos(mayBayRepository.findByTamBayLessThan(tamBay));
    }

    public List<MayBayDTO> timBoiLoai(String loaimaybay) {
        return MayBayMapper.MAY_BAY_MAPPER.toDtos(mayBayRepository.timBoiLoai(loaimaybay));
    }

}
