public class second {

    public static void main(String[] args){
        String x = "Water";
        String y = "Air";
        String temp = null;

        System.out.println("before swapping:");
        System.out.println("X:" + x);
        System.out.println("Y:" + y);

        temp = x;
        x=y;
        y = temp;

        System.out.println("after swapping:");
        System.out.println("X:" + x);
        System.out.println("Y:" + y);

    }
    
}
