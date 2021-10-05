import naya.c1;

public class ol {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int c = 30;


        System.out.println(add(a, b));
        System.out.println(add(a, b ,c));

    }

    public static int add(int a, int b){
        System.out.println("#1");
        return a+b;
    }

    public static int add(int a, int b , int c){
        System.out.println("#2");
        return a+b+c;
    }
}
