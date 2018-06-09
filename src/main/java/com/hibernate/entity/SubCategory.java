package com.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUB_CATEGORY")
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	
	@Column(name="CATEGORY_ID")
	private int categoryId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DEL_FLG")
	private int delFlg;
	
	@Column(name="INS_DATE")
	private Date insDate;
	
	@Column(name="UPD_DATE")
	private Date updDate;
	
	public SubCategory() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}

	public Date getInsDate() {
		return insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}
	
}
