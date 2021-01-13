/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class pr4{
   
    public void add(int n,int m){
        System.out.print("add");
        System.out.println(n+m);
    }
}

class pr5 extends pr4{
   
    public void sub(int n,int m)
    {
        System.out.print( "sub");
        System.out.println( n-m);
              
    }
}


public class inheri_simple2_cal {
    public static void main(String args[]){
        pr5 obj=new pr5();
        obj.sub(20,5);
        obj.add(20,5);
        
    }
}
