import java.util.Scanner;

public class inputString{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter your name");
     String name = input.nextLine();
     System.out.println("heyyy \t" + name );
     input.close();
  }
}