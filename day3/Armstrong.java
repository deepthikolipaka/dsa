package day3;
import java.util.Scanner;
import java.math.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original,rem,result=0;
        original=n;
        while(original != 0){
            rem=original%10;
            result+=Math.pow(rem,3);
            original/=10;
        }
        if(result==n)
            System.out.println(" It is a Armstrong nummber");
        else
            System.out.println("Given number is not a armstrong number");
    }
}
