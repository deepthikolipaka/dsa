//Subtract the Product and Sum of Digits of an Integer
package day11;
import java.util.Scanner;
public class Subract {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n,i,rem=0,sum=0,pro=1;
    System.out.println("Enter a number");
    n=in.nextInt();
    i=n;
    while(i!=0){
        rem =i%10;
        sum+=rem;
        pro*=rem;
        i/=10;
    }
    System.out.println("Sum of all digits:"+sum);
    System.out.println("Product of all digits :"+pro);
    System.out.println(pro-sum);
}
}
