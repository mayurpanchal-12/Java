package Whhile;

public class revser {
  public static void main(String[] args) {
    int num = 98765432;
    int reverse = 0;

     while (num>0) {
        int  remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;

     };
     System.out.println(reverse);
    }
}
