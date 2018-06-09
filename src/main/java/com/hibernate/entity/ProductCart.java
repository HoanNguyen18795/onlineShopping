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
@Table(name="PRODUCT_CART")
public class ProductCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@OneToMany
	@JoinColumn(name="ID")
	private int cartId;
	
	@OneToMany
	@JoinColumn(name="ID")
	private int productId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="DEL_FLG")
	private int delFlg;
	
	@Column(name="INS_DATE")
	private Date insDate;
	
	@Column(name="UPD_DATE")
	private Date updDate;
	
	public ProductCart() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
