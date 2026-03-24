package day2;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maths marks:");
      int math=sc.nextInt();
        System.out.println("Enter Physics marks:");      
          int phy=sc.nextInt();
        System.out.println("Enter chemistry marks:");
       int chem=sc.nextInt();
       if(math>35){
            if(chem>35){
                if(phy>35){
                    System.out.println("Student passed!!!");
                }
                else
                System.out.println("Student failed in physics");
            }
            else
            System.out.println("Student failed in phy and chem");
        }
        else if(chem<35){
            System.out.println("Failed in maths and chem!");
        }
        else if(phy<35){
            System.out.println("Failed in maths and physics");
        }
        else{
            System.out.println("Failed in maths!");
        }
        sc.close();
    }
}
