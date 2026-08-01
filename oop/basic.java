package oop;


class student {
   String name; 
   int age ;
  
}


public class basic {
    public static void main(String[] args) {
        
         student s1 = new student();
             s1.age = 20;
             s1.name = "Rohit";
        System.out.println(s1.name + "- " + s1.age);

        student s2 = new student();
            s2.name = "aaa";
            s2.age= 21;
        System.out.println(s2.name  + "-" + s2.age);

        student s3 = new student();
            s3.name = "bbb";
            s3.age = 23;
        System.out.println(s3.name + "-" + s3.age);
    }
}