package oop;

   class student{
    String name;
    int age;

    public void initializer(String n , int a){
       name=n;
       age = a;

    }
   }

public class basic2prac {
  public static void main(String[] args) {
      student s1 = new student();
      s1.initializer("wdew", 0);

    student s2 = new student();

    s2.initializer("wdew", 23);

    System.out.println(s1.age);
    System.out.println(s2.age);
     


  }
}
