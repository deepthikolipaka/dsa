/* A new TV streaming service was recently started in Chefland called the Chef-TV.
A group of N friends in Chefland want to buy Chef-TV subscriptions. We know that 
6 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is 
X rupees. Determine the minimum total cost that the group of 
N friends will incur so that everyone in the group is able to use Chef-TV.
*/
package day18;
import java.util.Scanner;
public class Subscription {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int x=in.nextInt();
            int m=(n+5)/6; //to seperate subscription
            System.out.println(m*x);
        }
    }
}
