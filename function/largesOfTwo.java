package function;

import java.util.Scanner;

public class largesOfTwo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter 1st num");
    int num = input.nextInt();
    int num2 = input.nextInt();
      System.out.println("greatest num from both num is " + great(num, num2));
  };
  public static int great(int num, int num2){
              
      if (num<num2) {
          return num2;
      }else{
         return num;
      }

   
  }
}
