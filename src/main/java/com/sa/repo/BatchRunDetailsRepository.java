package com.sa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.entity.BatchRunDetails;

public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails, Serializable> {

}
