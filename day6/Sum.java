package day6;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        for(i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
