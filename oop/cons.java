package oop;

class stu{
  String name;
  int age;

  public void initializer(String name , int age){
          this.name = name;
          this.age = age;
  };

  public void print(){
    System.out.println(name+age);
  }
}


public class cons {
  public static void main(String[] args) {
    
    stu s1 = new stu();
    s1.initializer("aaa", 0);
     s1.print();

     stu s2 = new stu();
     s2.initializer("bbb", 10);
     s2.print();

     stu s3 = new stu();
     s3.initializer("cccc", 20);
     s3.print();

   // Without a parameterized constructor, we cannot pass values
// during object creation.
// We have to create the object first and then assign values
// using a method.

  }
}
