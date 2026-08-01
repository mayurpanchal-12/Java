package function;

import java.util.Scanner;

public class cal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter 1st number for calculations");
    int number = input.nextInt();
    System.out.println("enter 2nd number also");
    int nummmm = input.nextInt();

    cal(number, nummmm);
  }
  public static void cal(int num , int num2){
       int sum = num +num2 ;
       System.out.println("sum of your both num is" + sum);

       int div = num / num2;
       System.out.println("division" + div);
  }
}
