
package my_java;

import java.util.Scanner;

class p1{
    public void display(){
        
        Scanner i =new Scanner(System.in);
        
        System.out.println("enetre no: ");
        int no=i.nextInt();
        
        System.out.println("you enterd : "+no);
    }
}

public class user_side_input {
    public static void main(String args[])
    {
        p1 obj=new p1();
    obj.display();
       // Scanner input=new Scanner(System.in);
        
    }
}
