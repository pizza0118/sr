package com.sr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SR_ORD_DTL")
public class OrdDtl  implements Serializable {

	private static final long serialVersionUID = -8503460439303447287L;
	
	@Id
	@Column(name = "ORD_DTL_ID")
	@GeneratedValue(generator = "uuid")
	// strategy 可使用 1.org.hibernate.id.UUIDGenerator 2.uuid2 >> 結果都一樣
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String ordDtlId;// 訂單明細ID	ORD_DTL_ID
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordMstId")
	private OrdMst ordMst;// 訂單明細主檔	ORD_DTL_MST
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prdId")
	private PrdMst prdMst;// 訂單明細產品	ORD_DTL_PRD
	
	@Column(name = "ORD_DTL_QTY")
	private Integer ordDtlQty;// 訂單明細數量	ORD_DTL_QTY

	public String getOrdDtlId() {
		return ordDtlId;
	}

	public void setOrdDtlId(String ordDtlId) {
		this.ordDtlId = ordDtlId;
	}

	public OrdMst getOrdMst() {
		return ordMst;
	}

	public void setOrdMst(OrdMst ordMst) {
		this.ordMst = ordMst;
	}

	public PrdMst getPrdMst() {
		return prdMst;
	}

	public void setPrdMst(PrdMst prdMst) {
		this.prdMst = prdMst;
	}

	public Integer getOrdDtlQty() {
		return ordDtlQty;
	}

	public void setOrdDtlQty(Integer ordDtlQty) {
		this.ordDtlQty = ordDtlQty;
	}
	
}
