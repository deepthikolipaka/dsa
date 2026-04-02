//24. Sum Of A Digits Of Number
package day11;
import java.util.Scanner;
public class Dsum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=in.nextInt();
        int result=0,s;
        int temp;
        temp=n;
        while(temp!=0){
            s=temp%10;
            result += s;
            temp/=10;
        }
        System.out.println("Sum of digits:"+result);


    }
    
}
