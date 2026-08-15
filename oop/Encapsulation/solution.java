package oop.Encapsulation;

public class solution {
  private String name ; 
private  int age; 

  public solution(String name , int age){
    this.name = name;
    this.age = age;
  };

  public void print(){
    System.out.println(name+age);
  }
};

class main{
  public static void main(String[] args) {
    solution s1 = new solution("mayur", 21);

    // now by making vars of calsses private we can not acces them out side class;
    // s1.name = "xyz"; ---err

    // System.out.println(s1.age);  --err 
  }
}
