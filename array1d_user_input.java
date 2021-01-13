/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

import java.util.Scanner;

class array{
    public void array1()
    {
    int n ;
    Scanner a=new Scanner (System.in);
    System.out.println(" enter the size of array ");
    n=a.nextInt();
    int x[]=new int[n];
    
    System.out.println("enter the element in the array");
    for(int i=0;i<=n;i++)
    {
      // int x[i]=new int[n];
           x [i]=a.nextInt();
       for(int j=i;j<=n;j++)
    System.out.println(j);
   
    
    }
    
    }
            }

public class array1d_user_input {
    public static void main(String args[])
    {
        array obj=new array();
        obj.array1();
    }
}
