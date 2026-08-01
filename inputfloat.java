import java.util.Scanner;

public class inputfloat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter float number");
    float num = input.nextFloat();
    System.out.println(num*num +"this is square of given number");
    input.close();
  }
}
