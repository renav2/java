/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;
class renav
{
    public void show()
    {
        System.out.println("renav");    
    }
    class vivek
    {
        public void display(){
            System.out.println("vivek");   
        }
    }  
}
public class inn_class_use {
    public static void main(String args[])
    {
        renav obj=new renav();
        obj.show();
        renav.vivek obj2=  obj.new vivek();
        obj2.display();
    }
}
