package oop;

class student{
  String name; // instance var
  int age ;
  
  public void initializer(String name , int age){ //local var
      this.name = name;  //this = current calling object
       this.age = age;

  };
  public void display(){
    System.out.println(name + "-" + age);
  };
}

public class thisKey {
   public static void main(String[] args) {
    
    student s1 = new student();
      s1.initializer("aaa",4);

      
      student s2 = new student();
      s2.initializer("bbb",5);
      s2.display();
   }
}
