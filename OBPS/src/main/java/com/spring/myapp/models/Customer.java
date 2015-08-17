package com.spring.myapp.models;

import java.util.*;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import com.spring.myapp.models.*;

@Entity
@Table(name = "customer", catalog = "myapp")
public class Customer implements java.io.Serializable{

    private int customerId;
    private String customerName;
    private Set<CxCorporationCustomer> cxCorporationCustomers = new HashSet<CxCorporationCustomer>();
 
    public Customer (){
        super(); 
    }
 
    public Customer(int customerId, String customerName){
        super();
        this.customerId = customerId; 
        this.customerName = customerName; 
    }

    public Customer(int customerId, String customerName, Set<CxCorporationCustomer> cxCorporationCustomers){
        super();
        this.customerId = customerId; 
        this.customerName = customerName; 
        this.cxCorporationCustomers = cxCorporationCustomers; 
    }

 
    @Id
    @Column(name = "customer_id")
    public int getCustomerId(){ 
        return this.customerId;
    }
 
    public void setCustomerId(int customerId){ 
        this.customerId = customerId;
    }
 
    @Column(name = "customer_name")
    public String getCustomerName(){ 
        return this.customerName;
    }
 
    public void setCustomerName(String customerName){ 
        this.customerName = customerName;
    }
 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    public Set<CxCorporationCustomer> getCxCorporationCustomers(){ 
        return this.cxCorporationCustomers;
    }
 
    public void setCxCorporationCustomers(Set<CxCorporationCustomer> cxCorporationCustomers){ 
        this.cxCorporationCustomers = cxCorporationCustomers;
    }
 
 
}
