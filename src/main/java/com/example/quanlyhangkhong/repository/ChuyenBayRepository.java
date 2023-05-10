package com.example.quanlyhangkhong.repository;
import com.example.quanlyhangkhong.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;
@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {

    List<ChuyenBay> findByGaDi(String gaDi);

    @Query(value = "Select * from chuyen_bay where chi_phi < ?1", nativeQuery = true)
    List<ChuyenBay> findByChiPhiLessThan(Long chiPhi);

    List<ChuyenBay> chuyenBayGaDen(String gaden);
}
