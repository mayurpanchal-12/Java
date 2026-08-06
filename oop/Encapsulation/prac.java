package oop.Encapsulation;

public class prac {
 private String  name ; 
 private int age;

  public prac(String name , int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setName(String name){
                  this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }

   public static void main(String[] args) {

    prac s1 = new prac("aaa" , 20);
    
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    
    //now to modyfy private vars we use setters 

    s1.setAge(12);
    s1.setName("mmmmmm");

    System.out.println(s1.getAge());
    System.out.println(s1.getName());
  }}

