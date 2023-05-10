package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.ChuyenBay;
import com.example.quanlyhangkhong.service.ChuyenBayService;
import com.example.quanlyhangkhong.service.dto.ChuyenBayDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI{
    private final ChuyenBayService chuyenBayService;

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> getAllChuyenBay() {
        return ResponseEntity.ok(chuyenBayService.getAllChuyenBay());
    }

    @Override
    public ResponseEntity<ChuyenBayDTO> getChuyenBayByMaCB(String maCB) {
        return ResponseEntity.ok(chuyenBayService.getChuyenbayByMaCB(maCB));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> findByGaDi(String gaDi) {
        return ResponseEntity.ok(chuyenBayService.findByGaDi(gaDi));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> findByChiPhiLessThan(Long chiPhi) {
        return ResponseEntity.ok(chuyenBayService.findByChiPhiLessThan(chiPhi));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> chuyenBayGaDen(String gaden) {
        return ResponseEntity.ok(chuyenBayService.chuyenBayGaDen(gaden));
    }
}
