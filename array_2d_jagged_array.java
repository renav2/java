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
public class array_2d_jagged_array {
    public static void main(String args[])
    {
        int a[][]={
            {1,2,3},{1,2},{1,3,4,5},{1,2,3,4,5} 
                  };
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(" "+a[i][j]);
        }System.out.println();
    }
    }
    
}
