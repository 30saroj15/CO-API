package com.sa.entity;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetails {

	int batch_run_seq;
	String batch_name;
	String batch_run_status;
	Date end_date;
	int instance_num;
	Date start_date;

}
