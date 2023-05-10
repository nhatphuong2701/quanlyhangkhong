package com.example.quanlyhangkhong.repository;

import com.example.quanlyhangkhong.entity.MayBay;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Long> {
    @Query(value = "select mb from MayBay mb where mb.tamBay < ?1")
    List<MayBay> findByTamBayLessThan(Long tamBay);

    List<MayBay> timBoiLoai(String loaimaybay);
}
