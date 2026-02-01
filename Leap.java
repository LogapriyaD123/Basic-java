import java.util.Scanner;
public class Leap{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int year= 0;
      while(year%4==0&&year%100!=0){
        if ((year%400==0)){
        }
        N++;
      }
   System.out.println(N);
      }
}