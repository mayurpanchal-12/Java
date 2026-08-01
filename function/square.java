package function;

import java.util.Scanner;

public class square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an number ");
    int num = input.nextInt();
    System.out.println("square of yiour num is \n "+ sq(num));
  }
  public static int sq(int num){
    return (num *num);
  }
}
