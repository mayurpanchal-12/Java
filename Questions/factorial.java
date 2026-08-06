package Questions;
import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter number to get its factorial");
    
    int num = input.nextInt();
    int increment = 1;
    int factorial = 1;
    
    while (increment<=num) {
      factorial *=increment;
      increment++;
    };

    System.out.println("factorial of given number is"+factorial);

     input.close();

  }
}
