import java.util.Random;

public class random_no {
    public static void main(String[] args){

        Random random = new Random();

        //int x = random.nextInt();//random no btwn -2 billion to 2 billion
        //int x = random.nextInt(6)+1;//dice nos.
        //double y = random.nextDouble();//btwn 0 and 1
        boolean z = random.nextBoolean();//random btwn true and false
        
        
        
        System.out.println(z);
    }
    
}
