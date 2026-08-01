import java.util.Scanner;

public class ExplicitConver2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter float num");
    int num = (int)input.nextFloat();
    System.out.println("your float will be converted to int as \t" +num);
    input.close();
  }
}
