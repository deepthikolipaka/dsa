/*Cake Discount
You buy N cakes from Chef's bakery. Normally, each cake costs 100 rupees.
However, Chef has a special discount offer. If you buy at least 
5 cakes, then you get a 15 percent discount on all your bought cakes, i.e. each cake costs only 85 rupees.
Find the cost, in rupees, that you paid for the N cakes */
package day17;
import java.util.Scanner;
public class Cake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=5)
            System.out.println(n*85);
        else
            System.out.println(n*100);
    }
}
