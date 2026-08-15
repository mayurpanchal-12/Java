package Questions;


public class sumOfEven {
  public static void main(String[] args) {

    int sum = 0;

    for(int i = 0 ;i<=100 ; i+=2){
      sum+=i;
    };
    System.out.println("sum of even num from 0 to 100" + sum);

  }
}
