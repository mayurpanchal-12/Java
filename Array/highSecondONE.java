package Array;

public class highSecondONE {
  public static void main(String[] args) {
    int[] arr = {5,1,8,2,9,3};

    int highest =arr[0];
    int sec = Integer.MIN_VALUE;

     for(int i = 1 ; i<arr.length ; i++){
          
        if (arr[i]>highest) {
           
          sec = highest;
          highest=arr[i];
          
        }

     }
  }
}
