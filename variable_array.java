/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java;

class pr1{
public int add(int ... a){
    int sum=0;
    for(int i:a){
        sum=sum+i;
    }   
    return sum;
}
}
public class variable_array {
public static void main(String args[])
{
 pr1 obj=new pr1();
 
 System.out.println(obj.add(5,4,1,100000));
 
 
}
}
