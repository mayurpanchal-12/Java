package Array; 
public class arr{
  public static void main(String[] args) {
    
  int[] arr = {12, 20 , 30 , 40 , 50 };

     for(int i = 1 ; i<arr.length-1 ; i++ ){

        arr[i] =arr[i+1];
     };

     for(int i = 0 ; i<arr.length ; i++){
      System.out.println(arr[i]);
     }

  }
}