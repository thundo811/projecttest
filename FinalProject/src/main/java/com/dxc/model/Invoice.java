package com.dxc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_invoice")
	private Long idinvoice;

	@Basic(optional = false)
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	@Length(max = 100)
	@Column(name = "contract_number")
	private String contractNumber;


	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "index_consumed")
	private Float indexConsumed;

	@Basic(optional = false)
	@Column(name = "total")
	private BigDecimal total;

	@Basic(optional = false)
	@Column(name = "vat")
	private float vat;


	@Basic(optional = false)
	@Column(name = "grand_total")
	private BigDecimal grandTotal;


	  @ManyToOne
	  @JoinColumn(name="customer_inv_id")
	    public User customer_inv;


	  @ManyToOne
	  @JoinColumn(name="services_inv_id")
	    public Service services_inv;


	public Long getIdinvoice() {
		return idinvoice;
	}


	public void setIdinvoice(Long idinvoice) {
		this.idinvoice = idinvoice;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getContractNumber() {
		return contractNumber;
	}


	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}


	public Float getIndexConsumed() {
		return indexConsumed;
	}


	public void setIndexConsumed(Float indexConsumed) {
		this.indexConsumed = indexConsumed;
	}


	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	public float getVat() {
		return vat;
	}


	public void setVat(float vat) {
		this.vat = vat;
	}


	public BigDecimal getGrandTotal() {
		return grandTotal;
	}


	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}




	public Service getCustome_inv() {
		return custome_inv;
	}


	public void setCustome_inv(Service custome_inv) {
		this.custome_inv = custome_inv;
	}


	public Service getServices_inv() {
		return services_inv;
	}


	public void setServices_inv(Service services_inv) {
		this.services_inv = services_inv;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
