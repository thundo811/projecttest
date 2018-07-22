package com.dxc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cpn")
    private Integer idCpn;
    
    
    @Basic(optional = false)
    @Length(max= 100)
    @Column(name = "name_cpn")
    private String nameCpn;
    
    
    @Basic(optional = false)
    @Column(name = "tax_code")
    private int taxCode;
    
    
    @ManyToOne
    @JoinColumn(name="service_cpn_id", 
	insertable=false, updatable=false, 
	nullable=false)
    public Service services_cpn;


	public Integer getIdCpn() {
		return idCpn;
	}


	public void setIdCpn(Integer idCpn) {
		this.idCpn = idCpn;
	}


	public String getNameCpn() {
		return nameCpn;
	}


	public void setNameCpn(String nameCpn) {
		this.nameCpn = nameCpn;
	}


	public int getTaxCode() {
		return taxCode;
	}


	public void setTaxCode(int taxCode) {
		this.taxCode = taxCode;
	}




	public Service getServices_cpn() {
		return services_cpn;
	}


	public void setServices_cpn(Service services_cpn) {
		this.services_cpn = services_cpn;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
    

