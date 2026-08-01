package Array;

public class biggest {
  public static void main(String[] args) {
    int[] arr = {4,5,1,7,8,4,3,2,9,2,4,5,8};
      int big = arr[0];
      
      for(int i = 1; i<arr.length ; i++){
if (arr[i] > big) {
      big =arr[i];
}

      }

      System.out.println(big);
  }
  
}
