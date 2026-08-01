package oop;

 class student{
  String name;   //these are instance var which are define class 
  int age;

  public void initialize(String n  , int a){  //these are local var which are used as parameter
    name = n;
    age = a;
  }
 }

public class basic2 {
  public static void main(String[] args) {

    student s1 = new student();
       s1.initialize("aaa", 21);
       System.out.println(s1.age + "-" + s1.name );
    
       student s2 = new student();
         s2.initialize("bbb", 22);
         System.out.println(s2.age + "-" + s2.name);

        student s3 = new student();
           s3.initialize("ccc", 20);
          System.out.println(s3.age + "-" + s3.name);

  }
}
