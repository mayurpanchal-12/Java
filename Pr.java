import java.util.Scanner;

public class Pr{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter number");
     int num = input.nextInt();
      System.out.println("entered number is " + num);
      input.close();
  }
}