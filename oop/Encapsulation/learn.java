package oop.Encapsulation;

import java.util.Objects;

public class  learn{
 private String name;
  private int age;

  public learn(String name , int age){
    this.name = name;
    this.age = age;
  };

  public String getString(){
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

  @Override
  public String toString(){
 return "Practice{name='" + this.name + "', age=" + this.age + "}";
  };
  
  @Override 
  public int hashCode(){
    return Objects.hash(this.name,this.age);

  }

  @Override
 public boolean equals(Object obj){
  if(this ==obj){
    return true;
  };
  if(obj ==null || getClass()!=obj.getClass()){
    return false;
  };
  learn other = (learn)obj;                                               

   return this.name.equals(other.name)  && this.age == other.age;

 }
  
  public static void main(String[] args) {
    
    learn s1 = new learn("Aaa" , 21);
    System.out.println(s1.getString());
    System.out.println(s1.getAge());
    s1.setAge(30);
    s1.setName("ssyg");
    System.out.println(s1+"s1");

    learn s2 = new learn("ssyg" , 30);
    System.out.println(s2+"s2");
    System.out.println(s1.equals(s2));

    int s1Hashcode= s1.hashCode();
    System.out.println(s1Hashcode);

  }
}

