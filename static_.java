/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class abc{
    int id;
    int sal;
    static String branch;
    
    
    public void show(){
        System.out.println(id + " : "+sal +" : " + branch);
    }
    
}

public class static_ {
public static void main(String args[])
{
    abc obj1=new abc();
    obj1.id=1;
    obj1.sal=2000;
    abc.branch="mech";
    //obj1.show();
    
    abc obj2=new abc();
    obj2.id=2;
    obj2.sal=30000;
    abc.branch="comp";
       
    abc.branch="comp";
    
obj1.show();
obj2.show();    
    
    
}
}
