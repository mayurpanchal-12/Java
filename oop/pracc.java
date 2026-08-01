package oop;

  class student{
    String name;
    int age;

    public void initializer(String name , int age){
      this.name = name;
      this.age = age;
    };

    public student(String name , int age){
      this.name = name;
      this.age = age;
    }

    public student(){

    }
    public void print(){
      System.out.println(name+age);
    }
  }

public class pracc {
  public static void main(String[] args) {
     
    student s1= new student("aaa" , 34);
    s1.print();

    student s2 = new student();
      s2.initializer("eer", 10);
          s2.print();

  }
}
