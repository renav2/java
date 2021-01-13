/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

/**
 * incapsulation binding of the data with methods
 * 
 * to  open setter getter use    (alt +insert) to disply the dilog box 
 * @author rvkul
 */

class renav1{
    String name;
    int age;
    String dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
public class setter_getter {
    public static void main(String args[])
    {
        renav1 obj=new renav1();
        obj.setAge(20);
       // obj.dob("25/02/2000");
        obj.setDob("25/02/2000");
        obj.setName("renab");
    
        
        System.out.println(obj.getAge());
           System.out.println(obj.getDob());
              System.out.println(obj.getName());
        
        
        
        
    }
}
