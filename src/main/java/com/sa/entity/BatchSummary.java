package com.sa.entity;

import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BATCH_SUMMARY")
public class BatchSummary {

	int summary_id;
	String batch_name;
	int failure_trigger_count;
	int success_trigger_count;
	int total_trigger_processed;

}
