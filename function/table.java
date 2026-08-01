package function;

import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("eneter num whose table you want");
    int num = input.nextInt();
    tablee(num);
  };
  public static void tablee(int num){

       for(int i = 1 ; i<=10 ; i++){
               System.out.println(num + "*" + i + "=" + (num*i));
       }

  }
}
