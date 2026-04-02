package day7;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int i,fact=1;
        for(i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial of given number:"+fact);

    }
}
