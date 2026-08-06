package oop.Encapsulation;

public class why {
String name ; 
int age ;

public why(String name , int age){
  this.name = name;
  this.age=age;
};

public void print(){

  System.out.println(name+age);
}
  
}


 class main {
  public static void main(String[] args) {
    why s1 = new why("xyz", 0);
    s1.print();

    /* 
now we do not use encapsulation so vars in classes can be modied here
 and also it can be print indivitually(out of the class)
it is problem for this we use encapsulation
*/
  s1.age=10;
  s1.name="mayur";
System.out.println(s1.age);
System.out.println(s1.name);



  }}
