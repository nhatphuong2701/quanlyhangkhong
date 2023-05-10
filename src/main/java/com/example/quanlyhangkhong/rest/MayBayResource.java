package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.MayBay;
import com.example.quanlyhangkhong.service.MayBayService;
import com.example.quanlyhangkhong.service.dto.MayBayDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MayBayResource implements MayBayAPI{

    private final MayBayService mayBayService;

    @Override
    public ResponseEntity<List<MayBayDTO>> getAllMayBay() {
        return ResponseEntity.ok(mayBayService.getAllMayBay());
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> finByTamBayLessThan(Long tamBay) {
        return ResponseEntity.ok(mayBayService.findByTamBayLessThan(tamBay));
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> timBoiLoai(String loaimaybay) {
        return ResponseEntity.ok(mayBayService.timBoiLoai(loaimaybay));
    }
}
