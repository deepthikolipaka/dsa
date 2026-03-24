import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    if(m<35){
        System.out.println("Failed:");
    }
    else if(m<50){
        System.out.println("Passed:");
    }
    else if(m<60){
        System.out.println("Passed with Second class:");
    }
    else if(m<70){
        System.out.println("Passed with First class:");
    }
    else{
        System.out.println("Distinction:");
    }
}
}
