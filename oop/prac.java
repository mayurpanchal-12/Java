package oop;

  class stu{
    String name;
    int age;

    public void initializer(String name , int age){
     this. name = name;
     this. age = age;
    }
    public void print(){
         System.out.println(name + age);
    }
  }

public class prac {
  public static void main(String[] args) {
      stu s1 = new stu();
      s1.initializer("aug", 0);
      s1.print();

  }
}
