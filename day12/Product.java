package day12;
public class Product{
    static int productt(int a,int b){
        int c=a*b;
        System.out.println("Product:"+c);
        return c;
        
    }
    public static void main(String[] args) {
        Product.productt(7, 9);
        Product.productt(17, 9);
        Product.productt(-6, 2);
    }
}