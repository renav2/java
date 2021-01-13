/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class as{
    
    public void metho(){
        int r[][]={
            {1,2,3,4},{1,5},{1,2,3,5,6,8,9,0},{11,22,444,55,7}
        };
        for(int k[]:r){
                    for(int m:k){
                        System.out.print(m);
                    }System.out.println();
        }  
    }
}
public class jagged_array_part2 {
 public static void main(String args[])
 {
     as obj=new as();
     obj.metho();
 }
}
