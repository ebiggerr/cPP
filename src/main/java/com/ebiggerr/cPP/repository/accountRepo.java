package com.ebiggerr.cPP.repository;

import com.ebiggerr.cPP.domain.account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface accountRepo extends JpaRepository<account.accountRequest,Long> {

    @Query(value="SELECT accountid,accountusername,accountpassword FROM account WHERE accountusername=?1", nativeQuery=true)
    Optional<account.accountRequest> getByUsername(String username);

}
