import java.lang.System;
import java.util.Scanner;
class printnameage{
    public static void main(String args[]){
        Scanner na = new Scanner(System.in);
        String Name = na.nextLine();
        String Address = na.nextLine();
        int Age = na.nextInt();
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Address: "+Address);
    }
}
