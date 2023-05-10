package com.example.quanlyhangkhong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
    @Id
    @Column(name = "MaNV", nullable = false)
    private Long maNV;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Luong")
    private Long luong;
}
