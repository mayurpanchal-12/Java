
import java.util.Scanner;

public class Input2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter your name");
     String name = input.nextLine();
     System.out.println("hello" + name);
     input.close();
  }
}
