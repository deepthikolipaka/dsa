package day4;

import java.util.Scanner;

public class ATriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float b=sc.nextInt();
        float h=sc.nextInt();
        float area=(0.5f) * b * h;
        System.out.println(area);
        sc.close();
    }
}
