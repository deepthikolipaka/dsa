/*IPL Ticket Rush
DAIICT college students want to attend an IPL match.
A total of N students from the college want to go while only 
M tickets are available for the match.
Determine how many students won't be able to book tickets.
*/
package day14;
import java.util.Scanner;
public class Ipl {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no.of students want to attend ipl");
        int n=in.nextInt();
        System.out.println("Enter how many tickets are available");
        int m=in.nextInt();
        System.out.println("The no.of students won't be able to attend ipl :"+Math.max(0,(n-m)));
        }
    }
