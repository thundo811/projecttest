
package com.dxc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer")
public class User implements Serializable {
	
	
	 private static long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id")
	    private Long id;
	    
	    @Basic(optional = false)
	    @Length(max= 100)
	    @Column(name = "name_customer")
	    @Size(min=3, max=30) 
	    private String nameCustomer;
	    
	    @Basic(optional = false)
	    @Length(max= 100)
	    @Column(name = "pass_customer")
	    @Size(min=3, max=30) 
	    private String passCustomer;
	    
	   
	    
	    @Length(max= 100)
	    @Column(name = "address")
	    private String address;
	    
	    @Basic(optional = false)
	    @Length(max= 100)
	    @Column(name = "email")
	    @Email @NotEmpty
	    private String email;
	  
	    
	    @Basic(optional = false)
	    @Column(name = "active")
	    private boolean active;
	    
	    

		@Basic(optional = false)
	    @Column(name = "role")
	    private boolean role;

	    @OneToMany(mappedBy="customer_inv",cascade=CascadeType.ALL)
	    private Set<Invoice> invoices;

		public boolean isRole() {
			return role;
		}
	    
	    public static long getSerialVersionUID() {
			return serialVersionUID;
		}


		public static void setSerialVersionUID(long serialVersionUID) {
			User.serialVersionUID = serialVersionUID;
		}




		public void setRole(boolean role) {
			this.role = role;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public static void setSerialversionuid(long serialversionuid) {
			serialVersionUID = serialversionuid;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNameCustomer() {
			return nameCustomer;
		}


		public void setNameCustomer(String nameCustomer) {
			this.nameCustomer = nameCustomer;
		}


		public String getPassCustomer() {
			return passCustomer;
		}


		public void setPassCustomer(String passCustomer) {
			this.passCustomer = passCustomer;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public boolean isActive() {
			return active;
		}


		public void setActive(boolean active) {
			this.active = active;
		}


//		public User(Long id, String nameCustomer, String passCustomer, String address, String email, boolean active,
//				boolean role) {
//			super();
//			this.id = id;
//			this.nameCustomer = nameCustomer;
//			this.passCustomer = passCustomer;
//			this.address = address;
//			this.email = email;
//			this.active = active;
//			this.role = role;
//		}
//
//
//		public User(String nameCustomer, String passCustomer, String email) {
//			super();
//			this.nameCustomer = nameCustomer;
//			this.passCustomer = passCustomer;
//			this.email = email;
//		}
//
//
//		public User() {
//			// TODO Auto-generated constructor stub
//		}
//		
//	


	    
	
}
