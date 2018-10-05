package com.sr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.entity.PrdMst;

@Repository
public interface PrdMstRepository extends JpaRepository<PrdMst, Long>{
	
	
}
