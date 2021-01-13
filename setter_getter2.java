/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;
class p3{
    int id;
    String name;
    int sal;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
public class setter_getter2 {
    public static  void main(String args[])
    {
        p3 obj=new p3();
        obj.setId(12);
        obj.setName("renav");
        obj.setSal(300000);
        
        
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSal());
    }
    
}
