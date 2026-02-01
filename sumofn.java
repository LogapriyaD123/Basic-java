import java.util.Scanner;
public class sumofn{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int sum = 0;
           while(n>=1){
            sum = sum + n;
             System.out.println(sum);
            n--;
           }
        
    }
}