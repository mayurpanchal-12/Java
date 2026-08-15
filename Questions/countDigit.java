package Questions;

import java.util.Scanner;

public class countDigit {
   public static void main(String[] args) {    
  Scanner input = new Scanner(System.in);
  System.out.println("enter an number to count its digits");
  
   int num = input.nextInt();
   int digits = 0 ;

   if(num==0){
    System.out.println("number have 1 digit");
   }else{
         while (num>0) {
          digits++;
          num = num/10;
         }
         System.out.println("number have " + digits + " digits");
   }

input.close();

}
}
