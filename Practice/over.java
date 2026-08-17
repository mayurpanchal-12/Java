package Practice;

class ex{
  public int math(int a){
  return a;
  };

  public float math(float b){
      return  b;
  };
  public int math(int a , int b){
    return a+b;
  }
}

public class over {
public static void main(String[] args) {
  ex s1 = new ex();

float a =   s1.math(3f);
  int b = s1.math(6);
 int c=  s1.math(3,7);

 System.out.println(a + "" + b + " " +c);


}
  

}
