package com.sa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.entity.EligibilityDetails;

public interface EligibilityRepository extends JpaRepository<EligibilityDetails, Serializable> {

}
