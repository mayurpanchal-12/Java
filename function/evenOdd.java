package function;

import java.util.Scanner;

public class evenOdd {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an number");
     int number = input.nextInt();
     
     evenOd(number);
   

   };
   public static void evenOd(int num){
     if (num % 2 == 0) {
       System.out.println("given num is even which is " + num);
    }else{
         System.out.println("number is odd which is " + num);
    }
   }
}
