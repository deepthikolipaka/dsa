package day5;

import java.util.Scanner;

public class Arectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        float area=2.0f *(length+breadth);
        System.out.println("Area of Rectangle"+area);
    }
}
