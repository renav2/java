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
public class array_2D {
   public static void main(String args[])
   {
       int abc[][]={
                    {2,3,4,5},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                   };
  for(int i=0;i<=4;i++)
  {
   for(int j=0;j<4;j++)
   {
       System.out.print(" "+abc[i][j]);
   }
      System.out.println();
   }
}
}