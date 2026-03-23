import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter How many stars do you want To print ina row or coulumn?");
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}