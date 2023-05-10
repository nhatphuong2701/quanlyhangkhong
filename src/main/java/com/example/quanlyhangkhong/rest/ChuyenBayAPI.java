package com.example.quanlyhangkhong.rest;

import com.example.quanlyhangkhong.entity.ChuyenBay;
import com.example.quanlyhangkhong.service.dto.ChuyenBayDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = ("/api/chuyenbay"))
public interface ChuyenBayAPI {
    @GetMapping
    ResponseEntity<List<ChuyenBayDTO>> getAllChuyenBay();
    @GetMapping("/{maCB}")
    ResponseEntity<ChuyenBayDTO> getChuyenBayByMaCB(@PathVariable("maCB") String maCB);

    @GetMapping("/find_by_ga_di")
    ResponseEntity<List<ChuyenBayDTO>> findByGaDi(@RequestParam("gaDi") String gaDi);

    @GetMapping("/find_by_chi_phi_less_than")
    ResponseEntity<List<ChuyenBayDTO>> findByChiPhiLessThan(@RequestParam("chiphi") Long chiPhi);

    @GetMapping("/find_by_ga_den")
    ResponseEntity<List<ChuyenBayDTO>> chuyenBayGaDen(@Param("gaden") String gaden);
}
