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
@Table(name = "cx_corporation_customer", catalog = "myapp")
public class CxCorporationCustomer implements java.io.Serializable{

    private int cxCorporationCustomerId;
    private Corporation corporation;
    private Customer customer;
 
    public CxCorporationCustomer (){
        super(); 
    }
 
    public CxCorporationCustomer(int cxCorporationCustomerId){
        super();
        this.cxCorporationCustomerId = cxCorporationCustomerId; 
    }

    public CxCorporationCustomer(int cxCorporationCustomerId, Corporation corporation, Customer customer){
        super();
        this.cxCorporationCustomerId = cxCorporationCustomerId; 
        this.corporation = corporation; 
        this.customer = customer; 
    }

 
    @Id
    @Column(name = "cx_corporation_customer_id")
    public int getCxCorporationCustomerId(){ 
        return this.cxCorporationCustomerId;
    }
 
    public void setCxCorporationCustomerId(int cxCorporationCustomerId){ 
        this.cxCorporationCustomerId = cxCorporationCustomerId;
    }
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corporation_id", nullable = false)
    public Corporation getCorporation(){ 
        return this.corporation;
    }
 
    public void setCorporation(Corporation corporation){ 
        this.corporation = corporation;
    }
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    public Customer getCustomer(){ 
        return this.customer;
    }
 
    public void setCustomer(Customer customer){ 
        this.customer = customer;
    }
 
 
}
