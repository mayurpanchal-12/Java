import java.util.Scanner;

public class Msg {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("hello good morning");
    System.out.println("enter number ");
    int num = input.nextInt();
    System.out.println("enter second number ");
    int num2 = input.nextInt();
    System.out.println("sum of given num " + (num+ num2));
    input.close();
  }
}