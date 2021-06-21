package com.ebiggerr.cPP.repository;

import com.ebiggerr.cPP.entity.carimage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carImageRepo extends JpaRepository<carimage,Long> {


}
