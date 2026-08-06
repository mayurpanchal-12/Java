package oop.methodOverLoading;

  class stu{
    String name;
    int age;

      public stu(String name , int age){
             this.name = name;
             this.age = age;
      };

     public void print(){
      System.out.println(name + age);
     };
  }

public class prac {

 
  public static int add(int a , int b){
           return a+b;
  };
  public static double add(double a, double b , double c){
    return a+b+c;
  }
 

  public static void main(String[] args) {
     stu s1 = new stu("aaa" , 22);
     stu s2 = new stu("bbb", 32);

   s1.print();
   s2.print();

   add(4.5, 7.8 , 8.8) ;
   add(55, 78) ;

   
    }
  }
