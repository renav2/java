/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class pra{
    class pra1{
            public void m(){
            char r[][]={
                 {'a','b','c','d'},{'s','s','s'},{'a','a','a','a','a'},{'e','e','e','e'}
                        };
             for(char k[]:r)
                {
                     for(char j:k)
                     {
                      System.out.print(j);
                     }
                System.out.println();
                 }
    
                            }      

           }
    }
public class jagged_part3 {
    //using inner classes
    public static void main(String args[])
    {
    pra obj=new pra();
    
     pra.pra1 obj2=obj.new pra1();
     obj2.m();   
    }    
}
