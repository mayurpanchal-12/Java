package Array;

public class highSecond {
  public static void main(String[] args) {
    
    int[] arr = {12, 4,5,6,12,6,9,2,8};
        int heighest = arr[0];
         int secondHighest = Integer.MIN_VALUE;

         for(int i = 0 ; i <arr.length ;i++){
          if (arr[i]>heighest) {
               heighest=arr[i];
                 }
          }

          for(int i = 0 ; i<arr.length ; i++){
           if (arr[i]>secondHighest && arr[i]<heighest) {
                secondHighest=arr[i];

           }

          }

         }
          
        


  }
  
