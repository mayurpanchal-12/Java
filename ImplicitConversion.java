import java.util.Scanner;

public class ImplicitConversion {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an number which is int");
    float num = input.nextFloat();
      System.out.println("you enter int but i accepts it in float \n if leterals are  shorter than data type then they are converted automatically so here youe int becomes float as \t" + num);
      input.close();
   }
}
