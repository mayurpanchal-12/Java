package Practice;

import java.util.Objects;

public class b{
 
 private String name;
  private int age;

  public b(){

  };

  public b(String name , int age){
     this.name = name;
     this.age = age;   
  };

  //getters

  public String getName(){
    return this.name;
  };
   
  public int getAge(){
    return this.age;
  }

  //setter

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
      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }

      b other = (b) obj;
    
      return this.name.equals(other.name) && this.age == other.age;
  }

  @Override
  public String toString(){
     return "" + name + "" +age;
  }

@Override
public int hashCode(){
  return Objects.hash(this.name , this.age);
}

public static void main(String[] args) {
  
   b s1 = new b("aaa" , 32);

   System.out.println(s1.getName());
   System.out.println(s1.getAge());

   s1.setName("zzzz");

   System.out.println(s1);

   b s2 = new b("zzzz" , 32);

     System.out.println(s1.equals(s2));
     System.out.println(s1.hashCode());

}
  

}