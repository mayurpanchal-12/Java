package oop.Encapsulation;


public class practice {
   private String name;
   private int age;

   public practice(String name , int age){

      this.name = name;
      this.age = age;
   };

   public String getName(){
       return this.name;
   };

   public int getAge(){
    return this.age;
   };

public void setName(String name){
      this.name = name;

};

public void setAge(int age){
  this.age = age;
};


  public String toString(){
      return "Practice{name='" + name + "', age=" + age + "}";
  }

       public static void main(String[] args) {
        

practice s1 = new practice("mmmm" , 22);
         System.out.println(s1.getAge());
         System.out.println(s1.getName());
       
         s1.setAge(555);
         s1.setName("PPPP");


    System.out.println(s1);
    System.out.println(s1);
       }


   }
  

