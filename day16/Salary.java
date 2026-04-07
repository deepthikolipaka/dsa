package day16;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        if(s>25000){
            s+=2000;
        }
        else {
            s+=1000;
        }
        System.out.println("new Salary :"+s);
    }
}
