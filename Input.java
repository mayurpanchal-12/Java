
import java.util.Scanner;

public class Input{
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.println("taking input");
      String name = input.nextLine();
      System.out.println(name);
  input.close();
  }
}