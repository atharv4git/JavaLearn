public class methods {
    public static void main(String[] args) {
        
        //String name = "ak";
        //int age = 19;
        //hello(name,age);

        int x = 1;
        int y = 2;
        
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        
        System.out.println("x+y= " + add(x,y));
    }

    static void hello(String title , Integer num) {
        System.out.println("a 'hello' static method was invoked!!! , with an argument " + title + " and integer : " + num);
    }

    static int add(int x , int y){
        return x+y;
    }

}
