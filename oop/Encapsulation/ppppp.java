package oop.Encapsulation;

public class ppppp {
 private String name;
  private int age;

  public ppppp(String name , int age){
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
  public String toString(){
 return "Practice{name='" + this.name + "', age=" + this.age + "}";
  }

  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    ppppp other = (ppppp) obj;
    return this.name.equals(other.name) && this.age == other.age;
  }
  public static void main(String[] args) {
    
    ppppp s1 = new ppppp("Aaa" , 21);
    System.out.println(s1.getString());
    System.out.println(s1.getAge());
    s1.setAge(30);
    s1.setName("ssyg");
    System.out.println(s1);

    ppppp s2 = new ppppp("Aaa" , 21);
  }
}
