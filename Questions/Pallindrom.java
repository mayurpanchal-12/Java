package Questions;

import java.util.Scanner;

public class Pallindrom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number taht whether it is pallindrom or not");

    int num = input.nextInt();
    int originalNumber = num;
    int reverse = 0 ; 

    while (num>0) {
         int remainder = num%10;          
         reverse = reverse*10+remainder;

      num= num/10;
    };

if (originalNumber == reverse) {
    System.out.println(originalNumber + " is a palindrome.");
} else {
    System.out.println(originalNumber + " is not a palindrome.");
}

input.close();
  }
}
