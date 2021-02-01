package com.sa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CO_PDFS")
public class COPdfs {

	int co_pdf_id;
	String plan_status;
	String case_number;
	String pdf_docunment;
	String plan_name;

}
