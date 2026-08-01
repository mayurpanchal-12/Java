import java.util.Scanner;

public class inputString2 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("hello where do you live");
    String Place = input.nextLine();
    System.out.println(Place);
    input.close();
  }
}
