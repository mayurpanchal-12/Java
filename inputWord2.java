import java.util.Scanner;

public class inputWord2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("hey i will accept only 1 word");
    String Word = input.next();
    System.out.println("accepted word is \n \t" + Word);
    input.close();
  }
}
