package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Customer_id")
	private Long id;
	@Column(name="Customer_name")
	private String name;
	@Column(name="Customer_phnNo")
	private Long phnNo;
	public Customer() {
		super();
	}
	
	
	public Customer(Long id, String name, Long phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.phnNo = phnNo;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(Long phnNo) {
		this.phnNo = phnNo;
	}
}
	
	