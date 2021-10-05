import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        String day;
        System.out.println("What day is it: ");
        day = scanner.nextLine();

        switch(day){
            case "sunday": System.out.println("hell yeahh!!!! itzzz SONDAYYYYYY");break;
            case "monday": System.out.println("okayyy the week has started");break;
            case "tuesday": System.out.println("hmm tuesday...");break;
            case "wednesday": System.out.println("I still need rest");break;
            case "thursday": System.out.println("what a loong week man");break;
            case "friday": System.out.println("kill me :)");break;
            case "saturday": System.out.println("at least I'm alive :)");break;
        }    

        scanner.close();

    }
}
