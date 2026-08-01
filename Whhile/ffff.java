package Whhile;

import java.util.Scanner;

public class ffff {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an num to get factorial of it ");
  int num = input.nextInt();

  int inceremt = 1; 
  int fact = 1; 

  while (inceremt<=num) {
    
     fact *=inceremt;
     inceremt++;
  }
 System.out.println("your factorial is " + fact);
  }
}
