/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java.oop;

class abc{
    
    
    int num ;
    int num2;
    int num3;
    
    public abc()
    {
    num=5;
    num2=5;
    System.out.println(num+num2);
    }
    public abc(int i,int j)
    {
      num=i;
      num2=j;
      System.out.println(num+num2);
    }
    public abc(int i,int j,int k)
    {
        num=i;
        num2=j;
        num3=k;
        System.out.println(i+j+k);
    }
    public abc(double i,double j)
        {
        double num=i;
        double num1=j;
        System.out.println(i+j);
        }
    public abc(double i,double j,double k)
    {
        double num=i;
        double num2=j;
        double num3=k;
        System.out.print(i+j+k );
    }   
}
public class constructor_overlod {
    public static void main(String args[])
    {
        abc obj =new abc(2.5,3.5,10.2);
    }
}
