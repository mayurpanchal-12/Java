package Whhile;

public class dCount {
    public static void main(String[] args) {
        int num = 8696802;
        int digit = 0;
        int sum = 0;

        if (num == 0) {
            System.out.println("Digits: " + 1);
            System.out.println("Sum of digits: " + sum);
        } else {
            while (num > 0) {
                int remainder = num % 10;
                sum += remainder;
                digit++;
                num = num / 10;
            }
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of digits: " + digit);
    }
}