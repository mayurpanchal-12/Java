package Array;

import java.util.Scanner;

public class arrrrr {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];
            arr[3]=6;
            arr[2]=8;
            arr[1]=7;
            arr[0]=8;
            arr[4]=2;

      for(int i = 0 ; i<arr.length; i++){
          System.out.println(arr[i]);
      };

      System.out.println("enter the length of array");
      int length = input.nextInt();
    int[] arr2 = new int[length];

    for(int i = 0; i<arr2.length ; i++){
      System.out.println("enter num for index :-" + i);
      arr[i]=input.nextInt();
    }
   
    for(int i = 0 ; i<arr2.length;i++){
      System.out.println(arr[i]);
    }


  }
}
