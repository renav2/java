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
public class char_2d {
    public static void main(String args[]){
        char b[][]={
            {'r','e','n','a','v'},
            {'p','r','a','s','d'},
            {'g','a'},
            {'s'} 
            };
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
                { 
                System.out.print(" "+b[i][j]);
                }
        System.out.println();
        }
    }
}
