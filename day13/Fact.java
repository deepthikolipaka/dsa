package day13;

public class Fact {
    int find(int x){
        int fact=1;
        for(int i=x;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        Fact obj=new Fact();
        obj.find(3);
        obj.find(5);
    }
}
