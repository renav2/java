/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

/*
 Car, Maruti and Maruti800. We have done a setup – class Maruti
extends Car and class Maruti800 extends Maruti.
With the help of this Multilevel hierarchy
setup our Maruti800 class is able to 
use the methods of both the classes (Car and Maruti).
 */
class car{
    public void show()
    {
        System.out.print("car --> ");
    }
    
}
class maruti extends car{
    public void carname()
    {
        System.out.print("maruti-->");
    }
}
class maruti800 extends maruti{
    public void carmodel()
    {
        System.out.println(" maruti 800");
    }
}
public class reallife1 {
    public static void main(String args[])
    {
        maruti800 obj= new maruti800();
        obj.show();
        obj.carname();
        obj.carmodel();
        
    }
}
