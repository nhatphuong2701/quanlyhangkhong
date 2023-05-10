package com.example.quanlyhangkhong.repository;

import com.example.quanlyhangkhong.entity.ChungNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {
}
