package day12;


public class Feven {
    int even (int a){
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        return a;
}
    public static void main(String[] args) {
        Feven obj=new Feven();
        obj.even(5);
        obj.even(5678);
    }
}
