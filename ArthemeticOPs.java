import java.util.Scanner;

public class ArthemeticOPs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
     System.out.println("give as an number ");
     int num = input.nextInt();

     System.out.println("give us another num");
     int num2 = input.nextInt();
   
     int sum = num + num2;
     int div = num / num2;
     int sub = num - num2;
     int multi = num *num2;

     System.out.println("addition is " + sum );
     System.out.println("addition is " + div );
      System.out.println("addition is " + sub);
       System.out.println("addition is " + multi );
  }
}
