/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class pre2{
public int a(int ...x){
    int sum=0;
            for(int i:x){
                sum=sum+i;
                
            }return sum;
            
}

}
public class veriable_arrr2 {
  
    
    public static void main(String args[])
    {
        
    pre2 obj=new pre2();
    
    System.out.println(obj.a(5,65));
    }
    }
