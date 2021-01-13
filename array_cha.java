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
public class array_cha {
    public static void main(String args[]){
        String renav[]=new String[5];
        renav[1]="renav";
        renav[2]="vivek";
        renav[3]="kulkarni";
        //i intensionaly inserted string into perticular index so i can just check  what op i get 
        for (int i=0;i<=5;i++)
        {
            System.out.println(renav[i]);
        }
        
    }
}
