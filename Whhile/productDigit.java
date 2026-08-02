package Whhile;

public class productDigit {
  
  public static void main(String[] args) {
    int num = 5432;
    int product=1;

    while (num>0) {
      int remainder = num%10;
         product *=remainder;

      num = num/10;
    }
    System.out.println("product of given number is " + product);
  }
}
