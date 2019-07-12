package com.pack.lombokdemo;

import lombok.NonNull;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Emp obj=new Emp("Surya",21,50000,"Programmer");
    	    //
    	    obj=null;
    	   App.display(obj);
    	    //Emp obj2=new Emp("Surya",21,50000,"Programmer");
    	   /* obj.setAge(25);
    	    obj.setSalary(30000);
    	    obj.setDesignation("Manager");*/
    	   // System.out.println(obj);
    	    //System.out.println(obj2);
    	    //System.out.println(obj.equals(obj2));
    	    
    	    
    	    }

    	public  static void display(@NonNull Emp e) {
    		 System.out.println("--------Employee details-----");
    		 System.out.println(e);
    	}
    
}
