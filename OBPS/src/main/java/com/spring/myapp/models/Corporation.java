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
@Table(name = "corporation", catalog = "myapp")
public class Corporation implements java.io.Serializable{

    private int corporationId;
    private String corporationName;
    private Set<Department> departments = new HashSet<Department>();
    private Set<CxCorporationCustomer> cxCorporationCustomers = new HashSet<CxCorporationCustomer>();
 
    public Corporation (){
        super(); 
    }
 
    public Corporation(int corporationId, String corporationName){
        super();
        this.corporationId = corporationId; 
        this.corporationName = corporationName; 
    }

    public Corporation(int corporationId, String corporationName, Set<Department> departments, Set<CxCorporationCustomer> cxCorporationCustomers){
        super();
        this.corporationId = corporationId; 
        this.corporationName = corporationName; 
        this.departments = departments; 
        this.cxCorporationCustomers = cxCorporationCustomers; 
    }

 
    @Id
    @Column(name = "corporation_id")
    public int getCorporationId(){ 
        return this.corporationId;
    }
 
    public void setCorporationId(int corporationId){ 
        this.corporationId = corporationId;
    }
 
    @Column(name = "corporation_name")
    public String getCorporationName(){ 
        return this.corporationName;
    }
 
    public void setCorporationName(String corporationName){ 
        this.corporationName = corporationName;
    }
 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "corporation")
    public Set<Department> getDepartments(){ 
        return this.departments;
    }
 
    public void setDepartments(Set<Department> departments){ 
        this.departments = departments;
    }
 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "corporation")
    public Set<CxCorporationCustomer> getCxCorporationCustomers(){ 
        return this.cxCorporationCustomers;
    }
 
    public void setCxCorporationCustomers(Set<CxCorporationCustomer> cxCorporationCustomers){ 
        this.cxCorporationCustomers = cxCorporationCustomers;
    }
 
 
}
