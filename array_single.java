/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

/**
 *
 * @author rvkul
 */
public class array_single {
    public static void main(String args[])
    {
        char renav[]=new char [5];
        
        //when you want us char just use  (  ' '  )
        //when u  want to use String use (   " "   )
        renav[0]='R';
        renav[1]='E';
        renav[2]='N';
        renav[3]='A';
        renav[4]='V';
       
        for (int i=0;i<=4;i++)
        {
            System.out.println(renav[i]);
        }
        
        
    }
}
