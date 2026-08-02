package oop.methodOverLoading;

 
public class practice {

public int add(int a , int b){
  return a+b;
}; 

public double add(double a , double b){
  return a+b;
};

public long add(long a , int b){
  return a+b;
};

public float add(int a , float b){
  return a+b;
};

public int add(int a){
  return a;
};



  public static void main(String[] args) {
       practice a = new practice();

   a.add(3, 5);
   a.add(3.5, 5.5);
  a.add(56);   

  }

}
