/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;


public class inhance_for_2d {
    public static void main(String args[])
    {
        int a[][]={  {1,2,3,4,5,6},{1,2,3,4},{1,2,3,0}};
        for(int k[]:a)
            {
            for(int j:k)
            {
            System.out.print(" "+j);
            
            }
            System.out.println();
            }
     }
    
}
