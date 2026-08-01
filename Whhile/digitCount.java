package Whhile;

public class digitCount {
    public static void main(String[] args) {
      int num = 23451839;
      int digit = 0;
     if (num == 0 ) {
       System.out.println("1 digit");
     }else{
      while (num>0) {
           digit++;
           num = num/10;
      }
      System.out.println("number of digits in the number is " + digit);
    }
  }
}
