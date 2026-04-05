//19. Curved Surface Area Of Cylinder
package day15;
import java.util.Scanner;
public class Curvedsa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        System.out.println("Curved Surface area :"+ 2*(x+y+z)); 
    }
}
