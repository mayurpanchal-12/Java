package Array;

public class prac {
  public static void main(String[] args) {
     int[] arr = new int[3];

     
     arr[2] = 4;
     arr[1]=3;
     arr[0] = 1;

  // {1,3,4}

       for(int i = 0 ; i<arr.length-1 ; i++){
           arr[i] = arr[i+1];
       }







     for(int i = 0 ; i<arr.length; i++){
      System.out.println(arr[i]);
     }
     System.out.println("this is lengthof array" + arr.length);
  }
}
