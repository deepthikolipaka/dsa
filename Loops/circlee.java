package Loops;

import java.util.Scanner;

public class circlee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of circle:");
        float radius = sc.nextFloat();
        float area=3.14f *radius * radius;
        System.out.println(area);
    }
}
