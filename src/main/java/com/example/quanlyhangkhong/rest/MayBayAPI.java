package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.MayBay;
import com.example.quanlyhangkhong.service.dto.MayBayDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = ("/api/maybay"))

public interface MayBayAPI {

    @GetMapping
    ResponseEntity<List<MayBayDTO>> getAllMayBay();

    @GetMapping("/find_by_tam_bay_less_than")
    ResponseEntity<List<MayBayDTO>> finByTamBayLessThan(@RequestParam("tamBay") Long tamBay);

    @GetMapping("/find_by_loai")
    ResponseEntity<List<MayBayDTO>> timBoiLoai(@Param("loa/imaybay") String loaimaybay);
}
