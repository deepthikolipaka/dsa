package day13;

public class Vote {
    int eligible(int x){
        if(x>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");
        return x;
    }
public static void main(String[] args) {
    Vote obj=new Vote();
    obj.eligible(7);
    obj.eligible(19);
}
}
