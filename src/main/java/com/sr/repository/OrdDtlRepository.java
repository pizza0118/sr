package com.sr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.entity.OrdDtl;

@Repository
public interface OrdDtlRepository extends JpaRepository<OrdDtl, Long>{

}
