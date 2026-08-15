package Questions;

import java.util.Scanner;

public class arrayHighest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = input.nextInt();

        int[] arr = new int[size];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element for index " + i + ":");
            arr[i] = input.nextInt();
        }

     
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        System.out.println("Highest element is: " + highest);

        input.close();
    }
}