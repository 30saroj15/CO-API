package com.sa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.entity.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Serializable> {

}
