package oop.Encapsulation;

public class student {
 private String name;
  private int age;

  public student(String name , int age){
             this.name=name;
             this.age=age;

  };
  
  //getter

  public String getName(){
      return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public String print(){
    return "object" +name+age;
  }
  



  
    public static void main(String[] args) {
      student s1 = new student("mayur" , 22);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());

        System.out.println("printing through print method"+ s1.print());

        //now by getters we can read only propertise 
        //if only getters are vailible it is called as read only 
    }
  }
