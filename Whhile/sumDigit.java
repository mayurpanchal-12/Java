package Whhile;

public class sumDigit {
  public static void main(String[] args) {
    int digit = 24637;
   int sum = 0;

   while (digit>0) {
       int remainder = digit%10;

       sum +=remainder;
     digit = digit/10;
   }
  System.out.println("sum of digits in given numbe is "+ sum);
  }
}
