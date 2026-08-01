import java.util.Scanner;

public class IfElse{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println("enyter your age");   
     int age = input.nextInt();
     if(age>=18){
      System.out.println("your age is ok");
     }else{
      System.out.println("you are child");
    }
    input.close();
}
}