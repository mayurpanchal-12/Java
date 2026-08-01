package Array;

public class smallest {
  public static void main(String[] args) {
    int[] arr = {7,8,9,5,4,9,6,1,2,34,5,7};
      
    int small = arr[0];
    int length = arr.length-1;
    for(int i = 0 ; i<length ; i++){
          int compair = arr[i+1];
      if (compair<small) {
        small = compair;
      }
    }
     System.out.println("smallest num is" + small );
  }
}
