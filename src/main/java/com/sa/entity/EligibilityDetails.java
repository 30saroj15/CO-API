package com.sa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="eligibility_details")
public class EligibilityDetails {
	
	@Id
	@GeneratedValue
    int ed_trace_id;
    String benefit_amt;
    int case_num;
    Date create_dt;
    String denial_reason;
    String plan_end_dt;
    String plan_name;
    String plan_start_dt;
    String plan_status;
    Date update_dt; 
   
}
