/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class at{
int a,b,c,d;
    public void add()
            {
            a=5;
            b=5;
            System.out.println(a+b);
            }
  class as{
      public void add2()
      {
          c=10;
          d=10;
          System.out.println(c+d);   
       } 
}    
   
    
    
}
public class inner_2 {
 public static void main(String args[]) {
     at obj=new at();
     obj.add();
     at.as obj2=obj.new as();
     obj2.add2();
     
 }  
}
