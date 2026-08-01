package Whhile;

import java.util.Scanner;

public class fact {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("enter num whose factorial you want");
    int num = input.nextInt();
    int ans = 1;

  for(int initialsMultiplyer=1 ; initialsMultiplyer<=num ; initialsMultiplyer++){
        ans *=initialsMultiplyer;
  }
  System.out.println("factorial of " + num + "is" + ans);
  }
}