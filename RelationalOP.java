import java.util.Scanner;

public class RelationalOP {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter you age ");
 int age = input.nextInt();
        if(age>=18 && age<=40){
          System.out.println("you are young");
        }else if(age>40 && age<=60){
          System.out.println("you are old");
        }else if(age>60 || age<18){
          System.out.println("hey buddi");
        }
        input.close();
  }
}
