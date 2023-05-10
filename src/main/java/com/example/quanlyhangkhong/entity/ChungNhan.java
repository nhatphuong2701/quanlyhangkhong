package com.example.quanlyhangkhong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChungNhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MaMB", nullable = false)
    private MayBay mayBay;

    @ManyToOne
    @JoinColumn(name = "MaNV", nullable = false)
    private NhanVien nhanVien;
}
