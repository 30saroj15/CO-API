package com.sa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.entity.COTriggers;

public interface COTriggersRepository extends JpaRepository<COTriggers, Serializable> {

}
