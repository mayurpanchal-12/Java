package Questions;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter number to get its reverse number");

    int num = input.nextInt();
    int reverseNumber=0;
    
     while (num>0) {
      int remainder = num%10;
        reverseNumber = reverseNumber*10+remainder;
      num = num/10;
     };

     System.out.println("reverse of given number is"+reverseNumber);
   input.close();
  }
}
