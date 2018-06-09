package com.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@OneToMany
	@JoinColumn(name="ID")
	private int orderId;
	
	@OneToMany
	@JoinColumn(name="ID")
	private int productId;
	
	@Column(name="DEL_FLG")
	private int delFlg;
	
	@Column(name="INS_DATE")
	private Date insDate;
	
	@Column(name="UPD_DATE")
	private Date updDate;
}
