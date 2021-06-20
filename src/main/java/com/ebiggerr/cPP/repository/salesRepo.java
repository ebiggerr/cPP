package com.ebiggerr.cPP.repository;

import com.ebiggerr.cPP.entity.upForSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface salesRepo extends JpaRepository<upForSales,Long> {

    @Query( value=" SELECT * FROM salesrecord WHERE accountid=?1 AND status='PENDING'",nativeQuery=true)
    Optional<List<upForSales>> getByAccountidIsAndStatusIs(long accountid);

    @Query( value = "SELECT * FROM salesrecord WHERE accountid=?1" ,nativeQuery=true)
    Optional<List<upForSales>> getAllOfAnId(long accountid);

    @Query (value="SELECT MAX(id) FROM salesrecord", nativeQuery=true)
    long getMaxID();
}
