package Practice;

public class methodOver {
  
  public int math(int a , int b ){
      return a+b;
  };

  public int math(int a){
    return a*a;
  };

  public float math(float a){
   return a;
  }

  public static void main(String[] args) {
    methodOver prac = new methodOver();
      
    prac.math(2.3f);
    prac.math(3);
  }
}
