package Questions;


import java.util.Scanner;

public class  arraySecondHighest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element for index " + i + ":");
            arr[i] = input.nextInt();
        }

        // Finding highest
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        // Finding second highest
        int secondHighest = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < highest && arr[i] > secondHighest) {
                secondHighest = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Highest element is: " + highest);
            System.out.println("Second highest element is: " + secondHighest);
        } else {
            System.out.println("There is no second highest element.");
        }

        input.close();
    }
}
