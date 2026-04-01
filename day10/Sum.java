//Define a program to find out whether a given number is even or odd with functions concept
package day10;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Sum s=new Sum();
        s.add();
    }
    void add() {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a %2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
