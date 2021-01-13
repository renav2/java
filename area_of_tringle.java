/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java.oop;


class tringle_area{
    float base;
    float height;
    float result ;
     
    
    public void area_tri()
    {
        result=(base*height)/2;
    }
           
}
public class area_of_tringle {
    
 public static void main(String args[])
 {
 tringle_area obj=new tringle_area();
 obj.base=5;
 obj.height= 5;
 obj.area_tri();
System.out.println("area of tringle is :-   \t "+obj.result);

 
 }   
 
}
