package oop.methodOverLoading;

/*
 Method overloading means creating multiple methods with the same name in the same class, but with different parameter lists. Java decides which method to call based on the arguments passed at compile time.
*/



//method overloading - multiple fn with same  name amd who follows following rules
 /*
   1.no.of param can be diff
   2.order of param can be diff
   3.data type of param can be diff
 */

   /*
     diffrence in fn return type means it is diff fn ;
   not considred in overloading fn 
   */

public class basic {

  public int add(int a , int b){     
     return a+b;
  };

  public double add(double a ,double  b){
    return a+b;
  }

  public float add(int a , float b){
    return a+b;
  };

  public int add(int a){
    return a;
  }

  public static void main(String[] args) {
     
    basic math = new basic();

       math.add(0); //calling add(int a)
       math.add(34, 7.4f); //calling add(int a , float b)
       math.add(7.5, 3.3); //calling add(double a , double b)
       math.add(5, 2); //calling add(int a , int b)
  }
}
