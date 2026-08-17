package Practice;

class information{
private  String name;
  private int age;

   public information(){

   };
   public information(String name , int age){
    this.name = name;
    this.age = age;
   }
  public void initializer(String name , int age){
        this.name = name;
        this.age = age;
  };
  
  //getter 
  public void getName(){
    
  }
  public void print(){
        System.out.println(name + "" +age);
  }
}

public class studentt {
  public static void main(String[] args) {
    
    information s1 = new information();
     s1.initializer("mayur", 10);
      s1.print();

      information s2 = new information("bbbb" , 23);
        s2.print();


  }
}
