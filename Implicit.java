import java.util.Scanner;

public class Implicit {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   System.out.println("enter an number whichh is  int ");
   float num = input.nextInt();
   System.out.println("your number assing to boigger data type which is float so it is automatical;y converted to float " + num);

   input.close();

 }  
}