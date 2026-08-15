package Questions;

import java.util.Scanner;

public class productDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an number to get its product");

    int num = input.nextInt();
    int product=1;
   
    
    if (num==0) {
      System.out.println("product of number is 0");
    }else{
    while (num>0) {
     int remainder = num%10;
      product = product*remainder;
      num = num/10;
    }
    System.out.println("product of given number is"+ product);
         
  };
  input.close();
}
}
