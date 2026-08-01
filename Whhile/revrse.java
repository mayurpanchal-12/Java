package Whhile;

import java.util.Scanner;

public class revrse {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter an number to get its reverse num ");
    int num = input.nextInt();
    int reverse = 0 ;
    for(; num >0 ; num= num/10){
      int remainder = num%10;
   reverse = reverse*10+remainder;

    };
    System.out.println(reverse);
   input.close();
   }
}