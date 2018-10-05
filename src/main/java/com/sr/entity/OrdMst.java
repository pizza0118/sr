package com.sr.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SR_ORD_MST")
public class OrdMst implements Serializable {

	private static final long serialVersionUID = -7972939050104956775L;

	@Id
	@Column(name = "ORD_MST_ID")
	@GeneratedValue(generator = "uuid")
	// strategy 可使用 1.org.hibernate.id.UUIDGenerator 2.uuid2 >> 結果都一樣
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String ordMstId;// 訂單主檔ID ORD_MST_ID

	@Column(name = "ORD_MST_DATE")
	private Date ordMstDate;// 訂單主檔日期 ORD_MST_DATE

	@Column(name = "ORD_MST_NO")
	private String ordMstNo;// 訂單主檔編號 ORD_MST_NO

	@Column(name = "ORD_MST_REMARK")
	private String ordMstRemark;// 訂單主檔備註 ORD_MST_REMARK
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordMst")
    private List<OrdDtl> ordDtlList;

	public String getOrdMstId() {
		return ordMstId;
	}

	public void setOrdMstId(String ordMstId) {
		this.ordMstId = ordMstId;
	}

	public Date getOrdMstDate() {
		return ordMstDate;
	}

	public void setOrdMstDate(Date ordMstDate) {
		this.ordMstDate = ordMstDate;
	}

	public String getOrdMstNo() {
		return ordMstNo;
	}

	public void setOrdMstNo(String ordMstNo) {
		this.ordMstNo = ordMstNo;
	}

	public String getOrdMstRemark() {
		return ordMstRemark;
	}

	public void setOrdMstRemark(String ordMstRemark) {
		this.ordMstRemark = ordMstRemark;
	}

	public List<OrdDtl> getOrdDtlList() {
		return ordDtlList;
	}

	public void setOrdDtlList(List<OrdDtl> ordDtlList) {
		this.ordDtlList = ordDtlList;
	}
	

}
