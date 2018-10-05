package com.sr.entity;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SR_PRD_MST")
public class PrdMst implements Serializable{

	private static final long serialVersionUID = 883052690972484307L;
	
	@Id
	@Column(name = "PRD_ID")
	@GeneratedValue(generator = "uuid")
	//strategy 可使用 1.org.hibernate.id.UUIDGenerator  2.uuid2    >> 結果都一樣
	@GenericGenerator(
		name = "uuid",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
	private String prdId;// 產品ID	  PRD_ID
	
	@Column(name = "PRD_NAME")
	private String prdName;// 產品名稱  PRD_NAME
	
	@Column(name = "PRD_REMARK")
	private String PrdRemark;// 產品備註  PRD_REMARK
	
	@Column(name = "PRD_IMAGE_1")
	private Blob prdImage1;// 產品照片1 PRD_IMAGE_1
	
	@Column(name = "PRD_IMAGE_2")
	private Blob prdImage2;// 產品照片2 PRD_IMAGE_2
	
	@Column(name = "PRD_IMAGE_3")
	private Blob prdImage3;// 產品照片3 PRD_IMAGE_3

	public String getPrdId() {
		return prdId;
	}

	public void setPrdId(String prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdRemark() {
		return PrdRemark;
	}

	public void setPrdRemark(String prdRemark) {
		PrdRemark = prdRemark;
	}

	public Blob getPrdImage1() {
		return prdImage1;
	}

	public void setPrdImage1(Blob prdImage1) {
		this.prdImage1 = prdImage1;
	}

	public Blob getPrdImage2() {
		return prdImage2;
	}

	public void setPrdImage2(Blob prdImage2) {
		this.prdImage2 = prdImage2;
	}

	public Blob getPrdImage3() {
		return prdImage3;
	}

	public void setPrdImage3(Blob prdImage3) {
		this.prdImage3 = prdImage3;
	}
}
