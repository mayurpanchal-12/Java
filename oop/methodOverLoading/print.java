package oop.methodOverLoading;

import java.util.Scanner;

class Printing{
  
  public void  p(int a){
         System.out.println(a);
  };

  public void p(String a){
    System.out.println(a);
  };

  public void p(double a){
    System.out.println(a);
  }

}

public class print {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter anything");
    String z = input.nextLine();
    Printing obj = new Printing();
     try{
      int num = Integer.parseInt(z);
      obj.p(num);
     }
     catch(NumberFormatException err){

        try{
           // Try double
                double d = Double.parseDouble(z);
                obj.p(d);

        }
        catch(NumberFormatException e2){
          obj.p(z);
        }

     }
    
    //  obj.p(input.next());
    //  obj.p(input.nextDouble());
    //  obj.p(input.nextInt());

  }
}
