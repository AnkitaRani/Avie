


package com.spring.myapp.app;




import java.util.List;

import com.spring.myapp.dao.CorporationDAO;
import com.spring.myapp.dao.DepartmentDAO;
import com.spring.myapp.dao.impl.CorporationDAOImpl;
import com.spring.myapp.dao.impl.DepartmentDAOImpl;
import com.spring.myapp.models.Corporation;
import com.spring.myapp.models.Department;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        
        
        CorporationDAO cd = new CorporationDAOImpl();
        Corporation corp = null;
        List<Corporation> corps = null;
        
        DepartmentDAO dd = new DepartmentDAOImpl();
        Department dept = null;
        List<Corporation> depts = null;

        
        //CREATE
        corp = new Corporation(1, "ABC");
        corp = cd.createCorporation(corp);
        if(corp != null){
            System.out.println("Inserted: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }else{
            System.out.println("Failed to Insert: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }
        
        //CREATE
        corp = new Corporation(2, "ABC");
        corp = cd.createCorporation(corp);
        if(corp != null){
            System.out.println("Inserted: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }else{
            System.out.println("Failed to Insert: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }
        
       //CREATE
        corp = new Corporation(3, "ABC");
        corp = cd.createCorporation(corp);
        if(corp != null){
            System.out.println("Inserted: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }else{
            System.out.println("Failed to Insert: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }
        
        //READ
        corp = new Corporation(3, "ABC");
        Corporation corp1 = cd.readCorporation(corp);
        if(corp1 != null){
            System.out.println("READ: "+corp1.getCorporationId()+"  "+corp1.getCorporationName());
        }else{
            System.out.println("Failed to READ: "+corp.getCorporationId()+"  "+corp.getCorporationName());
        }
        
        //UPDATE
        corp = new Corporation(3, "CBA");
        corp = cd.updateCorporation(corp);
        if(corp != null){
            System.out.println("Updated Successfully!");
        }else{
            System.out.println("Failed to Update!");
        }
        
        //LIST
        corps = cd.listCorporation();
        if(corps != null){
            System.out.println("List of Corporations:");
            for(Corporation crp : corps){
                System.out.println("Id: "+crp.getCorporationId()+"  Name: "+crp.getCorporationName());
            }
        }else{
            System.out.println("Failed to List!");
        }
        
        //UPDATE
        corp = new Corporation(3, "CBA");
        corp = cd.deleteCorporation(corp);
        if(corp != null){
            System.out.println("Deleted Successfully!");
        }else{
            System.out.println("Failed to Delete!");
        }
        
        //LIST
        corps = cd.listCorporation();
        if(corps != null){
            System.out.println("List of Corporations:");
            for(Corporation crp : corps){
                System.out.println("Id: "+crp.getCorporationId()+"  Name: "+crp.getCorporationName());
            }
        }else{
            System.out.println("Failed to List!");
        }
        
        
//        //CREATE
//        corp = new Corporation(2, "ABC");
//        dept = new Department();
//        dept.setDepartmentId(1);
//        dept.setDepartmentName("ITS");
//        dept.setDepartmentId(1);
//        dept.setCorporation(corp);
//        
//        dept = dd.createDepartment(dept);
//        if(dept != null){
//            System.out.println("Inserted: "+dept.getDepartmentId()+"  "+dept.getDepartmentName()+" "+dept.getCorporation().getCorporationId());
//        }else{
//            System.out.println("Failed to Insert: "+dept.getDepartmentId()+"  "+dept.getDepartmentName()+" "+dept.getCorporation().getCorporationId());
//        }
//        
//        //UPDATE
//        dept.setDepartmentName("Prft-ITS");
//        dept = dd.updateDepartment(dept);
//        if(dept != null){
//            System.out.println("Update Successfully!");
//        }else{
//            System.out.println("Failed to Update!");
//        }
//        
//        //READ        
//        Department dept1 = dd.readDepartment(dept);
//        if(dept1 != null){
//            System.out.println("READ: "+dept1.getDepartmentId()+"  "+dept1.getDepartmentName()+" "+dept1.getCorporation().getCorporationId());
//        }else{
//            System.out.println("Failed to READ: "+dept.getDepartmentId()+"  "+dept.getDepartmentName()+" "+dept.getCorporation().getCorporationId());
//        }
                   
    }
}




