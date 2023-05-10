package com.example.quanlyhangkhong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "MayBay.timBoiLoai", query = "select mb from MayBay mb where mb.loai = :loaimaybay" )
public class MayBay {
    @Id
    @Column(name = "MaMB", nullable = false)
    private Long maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private Long tamBay;
}
