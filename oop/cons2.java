package oop;

 class student {
  String name;
  int age;

  //constructor name = same as class name
  // it can not be static 
  // can not return anything even void
  /*if we create any type of constructor param/non param  then java did notcraete default 
    non param constructor  
  */

    /* 1)if we only create param cons then 
        then we can pass data only through construtor not with initializer
       so every constructor must need data 
     */

       /*
         2) if we not create any cons then we can not pass data through cons at all 
       */

    /*
      3) if we craete both cons then we can pass data with cons as well 
      as initializer
      
    */



    public student(String name , int age){
        this.name = name;
        this.age = age;
    };

    public student(){
          //  System.out.println(age+name);
    };

    public void initializer(String name , int age){
      this.name = name;
      this.age = age;
    }
    public void print(){
      System.out.println(name+age);
    }
  
 }

public class cons2 {
  public static void main(String[] args) {
    
    student s1 = new student();
       s1.initializer("aaa", 0);
       s1.print();

    student s2 = new student("bbbb" ,23);
      s2.print();

    student s3 = new student();
    s3.initializer("ccc", 30);
    s3.print();

    student s4 = new student("ddd", 40);
    s4.print();
  }
}
