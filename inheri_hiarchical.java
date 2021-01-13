/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

/**
 *hiarchical inhertance
 * 
 * 
 *          >one< 
 * 
 *   ^        ^         ^
 * two      three      four
 * 
 * 
 * @author rvkul
 */


class one{
    public void show(){
        System.out.println("one");
    }
}

class two extends one{
public void display()
{
    System.out.print("second");   
}
}

class three extends one
{
    public void dakhav()
    {
        System.out.print(" three");
    }
    
}

class four extends one
{
    public void pl()
    {
        System.out.print(" four ");
    }
}


public class inheri_hiarchical {

    public static void main(String args[])
    {
        two obj=new two();
        three obj1= new three();
        four obj2=new four();
        
        obj.show();
        obj1.show();
        obj2.show();
        
    }
    
}
