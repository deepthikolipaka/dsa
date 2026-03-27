package day5;

import java.util.Scanner;

public class Averagenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int N=sc.nextInt();
        int i,sum=0;
        float avg=0;
        for(i=0;i<=N;i++){
            sum+=i;
                }
                avg=sum/N;
                System.out.println(avg);
    }
}
