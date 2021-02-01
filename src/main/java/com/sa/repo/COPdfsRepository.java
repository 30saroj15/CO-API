package com.sa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.entity.COPdfs;

public interface COPdfsRepository extends JpaRepository<COPdfs, Serializable> {

}
