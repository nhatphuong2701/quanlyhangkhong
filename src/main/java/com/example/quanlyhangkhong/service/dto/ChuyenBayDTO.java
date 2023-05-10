package com.example.quanlyhangkhong.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBayDTO {
    private String maCB;
    private String gaDi;
    private String gaDen;
    private Long doDai;
    private LocalTime gioDi;
    private LocalTime gioDen;
    private Long chiPhi;
}
