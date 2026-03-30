//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
 package day8;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num");
        int sum=0,add=0,sum1=0;
        while(true){
        int n=sc.nextInt();
        if(n>0){
            if(n%2==0)
             sum+=n;
            else
                sum1+=n;
        }
        else if(n<0)
            add+=n;
        
        else if(n==0)
            break;
    }
    System.out.println("Positive even sum:"+sum);
    System.out.println("positive odd sum:"+sum1);
    System.out.println("Negative sum:"+add);
    }
}
