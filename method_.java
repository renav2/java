/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class xyz
{
    public void add(){
        int num1=5;
        int num2=5;
        System.out.println(num1+num2);
        
    }
    public void add(double n1,double n2){
        double num1 = n1;
        double num2=n2;
        System.out.println(n1+n2);
        
    }
    
    
}
public class method_ {
  
    public static void main(String args[]){
    xyz obj=new xyz();
    obj.add(5.1,2.1);
    }
    
}
