/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;
class pr2{
    public void display(){
        System.out.println("sample");
    }
}
class pr3 extends pr2 {
    public void show(){
        
        System.out.println("print");
        
        
    }
}

public class inheri_simple {
   public static void main(String args[])
   {
       pr3 obj=new pr3();
       obj.show();
       obj.display();
   }
    
    
}
