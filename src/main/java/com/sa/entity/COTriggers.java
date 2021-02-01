package com.sa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "co_triggers")
public class COTriggers {
	@Id
	@GeneratedValue
	int trg_id;
	int case_num;
	Date create_dt;
	String trg_status;
	Date update_date;

}
