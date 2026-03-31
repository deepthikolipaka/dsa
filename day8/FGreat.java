package day8;

import java.util.Scanner;

public class FGreat {
    public static void main(String []args) {
            great();
             great();
              great();
    }
    static int great(){
        int a,b;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        if(a>b){
            System.out.println(a+"is bigger");
        }
        else if(b>a){
            System.out.println(b+"is greater");
        }
        else{
            System.out.println("Both are equal");
        }
        return a;

    }
    
}
