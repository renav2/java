/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java.oop;


class renav{
    
    int num;
   int num2;
   
    
    public renav()
    {
     num=5;
    num2 =5;
    }
    
    public renav(int n)
        {
         num = n;
        num2=n;
        
        }
    public renav(double n,int n1){
        num=(int) n;
        num2=(int) n1;
    }
    
    
    
    
}
public class constructor_overloding {
    
    public static void main(String args[])
    {
        renav obj=new renav((int) 7.5);
        System.out.println(obj.num2);
    }
    
}
