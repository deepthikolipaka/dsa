package day13;
import java.util.Scanner;
public class Naturalsum {
    Scanner in=new Scanner(System.in);
     void add(){
        int x=in.nextInt();
        int i,sum=0;
        for(i=1;i<=x;i++){
            sum+=i;
        }
        System.out.println("Sum of n natural numbers :"+sum);
    }
    public static void main(String[] args) {
        Naturalsum obj=new Naturalsum();
        obj.add();
    }
}
