package Whhile;

import java.util.Scanner;

public class pallindrom {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("enter an num to check whether it is pallindrom or not ");
  int num = input.nextInt();
   int originalnum = num;
   int reverse = 0;
   while (num>0) {
    int remainder = num%10;
      reverse = reverse*10+remainder;

     num = num/10;
   };

  String finalAns = originalnum==reverse ?"it is pallindrom":"not pallindrom";
  System.out.println(finalAns);
  input.close();
 }
}