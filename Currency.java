import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rupees :");
        float rupees=sc.nextFloat();
        float usd=rupees * 0.0106f;
        System.out.println("US Dollar:"+usd);
    }
}
