package src;

import java.util.Scanner;

//Determine the largest of four numbers entered by the user.
public class LargestOfFour {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=s.nextInt();
        System.out.print("Enter number 2: ");
        int num2=s.nextInt();
        System.out.print("Enter number 3: ");
        int num3=s.nextInt();
        System.out.print("Enter number 4: ");
        int num4=s.nextInt();

        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println(num1+ " is large");
        } else if (num2>num1 && num2>num3 && num2>num4) {
            System.out.println(num2+ " is large");
        } else if (num3>num1 && num3>num2 && num3>num4) {
            System.out.println(num3+ " is big");
        } else {
            System.out.println(num4+ " is large");
        }

    }
}
