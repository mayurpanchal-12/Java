package Array;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter size of array");
    int size = input.nextInt();
     int[] arr = new int[size];

     for(int i =0 ; i<arr.length ; i++){
        
      System.out.println("enter arr for  "+ i + "index");
            arr[i]= input.nextInt();
        

     }
    
  }
}
