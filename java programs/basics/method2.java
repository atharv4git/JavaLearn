public class method2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        int c = 45;

        System.out.println(add(a,b,c));
        System.out.println(mult(a,b,c));

    }

    static int add(int x , int y , int z){
        return x+ y +y;
    }

    static int mult(int x , int y , int z){
        return x*y*z;
    }

    static void hello(){
        System.out.println("fuck off");
    }
}
