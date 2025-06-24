import java.lang.System;
import java.util.Scanner;
class Scorconve{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Department = sc.nextLine();
        Double score = sc.nextDouble();
        System.out.println("Name: "+Name);
        System.out.println("Department: "+Department);
        System.out.println("Score: "+score/10);
    }
}