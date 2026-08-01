import java.util.Scanner;

public class inputFloat2 {
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.println("enter float number");
  float num = input.nextFloat();
  System.out.println(num*num*num +"\t this is cube of given number");
  input.close();

 }
}
