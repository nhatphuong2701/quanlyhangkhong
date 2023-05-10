package com.example.quanlyhangkhong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries
        (@NamedQuery(name = "ChuyenBay.findByGaDi",
                query = "select cb from ChuyenBay cb where cb.gaDi = ?1"

))

@NamedNativeQuery(name = "ChuyenBay.chuyenBayGaDen", query = "select * from chuyen_bay where ga_den = :gaden", resultClass = ChuyenBay.class)

public class ChuyenBay {
    @Id
    @Column(name = "MaCB", nullable = false)
    private String maCB;

    @Column(name = "GaDi")
    private String gaDi;

    @Column(name = "GaDen")
    private String gaDen;

    @Column(name = "DoDai")
    private Long doDai;

    @Column(name = "GioDi")
    private LocalTime gioDi;

    @Column(name = "GioDen")
    private LocalTime gioDen;

    @Column(name = "ChiPhi")
    private Long chiPhi;
}
