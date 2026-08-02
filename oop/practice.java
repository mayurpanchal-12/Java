package oop;

class student{
  String name;
  int age;

  public student(){

  }

   public student(String name , int age){
    this.name = name;
    this.age = age;
   }  

   public void initilizer(String name , int age){
             this.name = name;
             this.age = age;

   }

  public void print(){
    System.out.println(name+age);
  }
}

public class practice {
 public static void main(String[] args) {
  student s1 = new student("aaa" , 21);
           s1.print();

     student s2 = new student();
       s2.initilizer("dddd", 20);
       s2.print(); 
     

 }
  

}
