/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java.oop;
class cals{
    int num1;
    int num2;
    int result;
    public void add()
     {
        result=num1+num2;
     }
    public void sub()
    {
        result=num1-num2;
        
    }
    public void mul()
    {
        result=num1*num2;
        
    }public void div()
    {
        result=num1/num2;
        
    }
    public void mod()
    {
        result=num1%num2;
        
    } 
}
public class calculator_oop {
    public static void main(String args[]){
        
        //creating object
        
        cals obj=new cals();
        obj.num1=5;
        obj.num2=5;
        obj.add();
        System.out.println("your addition is :-  "+obj.result);
        obj.sub();
        
        System.out.println("your sub is :-  "+obj.result);
        obj.mul();
        System.out.println("your multiplication is :-  "+obj.result);
        obj.div();
        System.out.println("your Division is :-  "+obj.result);
        obj.mod();
        System.out.println("your mod is :-  "+obj.result);
    }
}
