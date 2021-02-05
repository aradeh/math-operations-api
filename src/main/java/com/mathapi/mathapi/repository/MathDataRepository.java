package com.mathapi.mathapi.repository;

import com.mathapi.mathapi.Model.MathData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MathDataRepository extends JpaRepository<MathData, Long>,JpaSpecificationExecutor<MathData>{
    
}
