/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class p5{
    public int add(int a,int b)
    {
        int sum;
        
        sum=a+b;
        return sum;
        }
    }
class p6 extends p5{
    public int sub(int a,int b)
    {
       int  sub;
       sub=a-b;
        return sub;
    }
}
class p7 extends p6{
public int mul(int a,int b)
{
    int mul=a*b; 
return mul;
}
}
public class inheri_multilvl {
    public static void main(String args[])
    {
    
    p7 obj=new p7();
   // obj.mul(5,2);
   // obj.sub(10,5);
    //obj.add(5,7);
    
    System.out.println( obj.mul(5,2));
    System.out.println(obj.sub(10,5) );
    System.out.println( obj.add(15,5));
    
    
    }
            }
