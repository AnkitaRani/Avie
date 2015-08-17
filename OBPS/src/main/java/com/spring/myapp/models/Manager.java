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
@Table(name = "manager", catalog = "myapp")
public class Manager implements java.io.Serializable{

    private int managerId;
    private String firstName;
    private String lastName;
    private Department department;
 
    public Manager (){
        super(); 
    }
 
    public Manager(int managerId, String firstName, String lastName){
        super();
        this.managerId = managerId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
    }

    public Manager(int managerId, String firstName, String lastName, Department department){
        super();
        this.managerId = managerId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.department = department; 
    }

 
    @Id
    @Column(name = "manager_id")
    public int getManagerId(){ 
        return this.managerId;
    }
 
    public void setManagerId(int managerId){ 
        this.managerId = managerId;
    }
 
    @Column(name = "first_name")
    public String getFirstName(){ 
        return this.firstName;
    }
 
    public void setFirstName(String firstName){ 
        this.firstName = firstName;
    }
 
    @Column(name = "last_name")
    public String getLastName(){ 
        return this.lastName;
    }
 
    public void setLastName(String lastName){ 
        this.lastName = lastName;
    }
 
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Department getDepartment(){ 
        return this.department;
    }
 
    public void setDepartment(Department department){ 
        this.department = department;
    }
 
 
}
