package com.dxc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;


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
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date date;

	@Length(max = 100)
	@Column(name = "contract_number")
	private String contractNumber;


	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "index_consumed")
	private Float indexConsumed;


	@Length(max = 100)
	@Column(name = "name_company")
	private String nameCompany;
	
	


	public String getNameCompany() {
		return nameCompany;
	}


	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}


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






	public BigDecimal getGrandTotal() {
		return grandTotal;
	}


	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}






	public User getCustomer_inv() {
		return customer_inv;
	}


	public void setCustomer_inv(User customer_inv) {
		this.customer_inv = customer_inv;
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
