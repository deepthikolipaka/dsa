package day11;
import java.util.Scanner;
public class Enterr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        while(true){
            int n=in.nextInt();
            if(n==0)
                break;
             sum +=n;
        }
System.out.println("Sum of all numbers till now entered :"+sum);
    }
}
