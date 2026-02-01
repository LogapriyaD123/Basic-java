
import java.util.Scanner;

public class inputandoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();    
        int age = sc.nextInt();

        System.out.println(input +" is " + (age + 1));
    }
}
