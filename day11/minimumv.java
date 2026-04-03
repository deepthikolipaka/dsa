package day11;
import java.util.Scanner;
import java.math.*;
public class minimumv {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        while(true) {
            n=in.nextInt();
            System.out.println(Math.pow(n,3));
            if(n==0)
                break;
        }
    }
    
}
