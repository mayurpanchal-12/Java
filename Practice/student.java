package Practice;

import java.util.Objects;

class info{
 private String name ;
  private int age ; 

  public info(String name , int age){
      this.name = name;
      this.age = age;
  }

  public String toString(){
    return this.name + " " + this.age;
  };

  //getter

  public String getName(){
    return this.name;
  };

  public int getAge(){
    return this.age;
  };

//setters

public void setName(String name){
  this.name = name;
};

public void setAge(int age){
  this.age = age;
};

@Override
public boolean equals(Object obj){
 if(this == obj){
  return false;
 };
 if(obj == null || getClass() != obj.getClass()){
  return false;
 };

 info other = (info) obj;

 return this.name.equals(other.name) && this.age == other.age;

}

@Override

public int hashCode(){
  return Objects.hash(this.age , this.name);
}
}



public class student{
  
  public static void main(String[] args) {
    
  info s1 = new info("mayur", 22);
    System.out.println(s1);
     
    s1.setName("ssss");
    s1.setAge(20);

    System.out.println(s1);

info s2 = new info("ddd", 11);
System.out.println(s1.equals(s2));
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
  }
}