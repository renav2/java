/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;
//constructor overloding 
// inheritance //
//simple inheritance

class pre5
{
    public pre5()
        {
        System.out.print("without parameter 5    ");
        }
    
    public pre5(int i)
        { 
        System.out.println("with constructor 5  "+ i);
        }

}
class pre6 extends pre5
{
        public pre6(){
            super();
           System.out.println("without parameter pre 6  "); 
        }
        
        
        public pre6 (int i)
        {
            super(i);
            System.out.println(" with parameter 6    "+i);
        }
}

public class inheri_simple_super_key {
    public static void main(String args[])
    {
        pre6 obj=new pre6(7);
        
    }
}
