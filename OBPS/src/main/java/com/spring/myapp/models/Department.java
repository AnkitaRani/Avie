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
@Table(name = "department", catalog = "myapp")
public class Department implements java.io.Serializable{

    private int departmentId;
    private String departmentName;
    private Manager manager;
    private Corporation corporation;
    private Set<Employee> employees = new HashSet<Employee>();
 
    public Department (){
        super(); 
    }
 
    public Department(int departmentId, String departmentName){
        super();
        this.departmentId = departmentId; 
        this.departmentName = departmentName; 
    }

    public Department(int departmentId, String departmentName, Manager manager, Corporation corporation, Set<Employee> employees){
        super();
        this.departmentId = departmentId; 
        this.departmentName = departmentName; 
        this.manager = manager; 
        this.corporation = corporation; 
        this.employees = employees; 
    }

 
    @Id
    @Column(name = "department_id")
    public int getDepartmentId(){ 
        return this.departmentId;
    }
 
    public void setDepartmentId(int departmentId){ 
        this.departmentId = departmentId;
    }
 
    @Column(name = "department_name")
    public String getDepartmentName(){ 
        return this.departmentName;
    }
 
    public void setDepartmentName(String departmentName){ 
        this.departmentName = departmentName;
    }
 
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "department", cascade = CascadeType.ALL)
    public Manager getManager(){ 
        return this.manager;
    }
 
    public void setManager(Manager manager){ 
        this.manager = manager;
    }
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corporation_id", nullable = false)
    public Corporation getCorporation(){ 
        return this.corporation;
    }
 
    public void setCorporation(Corporation corporation){ 
        this.corporation = corporation;
    }
 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    public Set<Employee> getEmployees(){ 
        return this.employees;
    }
 
    public void setEmployees(Set<Employee> employees){ 
        this.employees = employees;
    }
 
 
}
