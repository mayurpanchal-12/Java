import java.util.Scanner;

public class inputint2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter any number");
    int num = input.nextInt();
    System.out.println(num*num + "\t this is square of given number");
    input.close();
  }
}
