package day12;

public class Sum {
    int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.add(5,9);
    }
}
