package com.dxc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "service")
public class Service implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_service")
    private Long idservice;
    
    @Basic(optional = false)
    @Column(name = "name_service",length=10485760)
    private String nameService;
    
	@Basic(optional = false)
	@Column(name = "unit")
	private BigDecimal unitServices;
    
    
    @OneToMany(fetch = FetchType.EAGER,mappedBy="services_cpn",cascade=CascadeType.ALL)
    private Set<Company> companys;
    
    @OneToMany(mappedBy="services_inv",cascade=CascadeType.ALL)
    private Set<Invoice> Invoice;

    @Basic(optional = false)
    @Column(name = "vat")
    private BigDecimal vatServices;
    
    

	public Set<Invoice> getInvoice() {
		return Invoice;
	}

	public void setInvoice(Set<Invoice> invoice) {
		Invoice = invoice;
	}

	public BigDecimal getUnitServices() {
		return unitServices;
	}

	public void setUnitServices(BigDecimal unitServices) {
		this.unitServices = unitServices;
	}

	public BigDecimal getVatServices() {
		return vatServices;
	}

	public void setVatServices(BigDecimal vatServices) {
		this.vatServices = vatServices;
	}

	public Long getIdservice() {
		return idservice;
	}

	public void setIdservice(Long idservice) {
		this.idservice = idservice;
	}

	public String getNameService() {
		return nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
	}


	

	public Set<Company> getCompanys() {
		return companys;
	}

	public void setCompanys(Set<Company> companys) {
		this.companys = companys;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
    
    
    
   	
    
}
