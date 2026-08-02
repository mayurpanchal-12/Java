package Practice;

public class a {
  public static void main(String[] args) {
    int[] arr = new int[5];

    arr[0] = 23;
    arr[1] = 32;
    arr[2] = 35;
    arr[3]=2;
    arr[4]=10;

    //printing arr 

    for(int i=0 ; i <arr.length ; i++){
      System.out.println(arr[i]);
    };
    
    //deleteing ele from array  ; here deleteing 2 ={23 , 32, 35 , 2 , 10};

        for(int i = 3 ;i<arr.length-1; i++ ){
          arr[i]=arr[i+1];

          //now arr = {23 , 32 , 35 , 10 , 10 }
        }

        //deleteing 32 

        for(int i = 1 ; i <arr.length-1; i++){
            arr[i]=arr[i+1];
        } 

        //print 

        for(int i =0 ; i<arr.length ; i++){
          System.out.print(arr[i]+"-");
        } //{23 , 35 , 10 ,10 , 10 }

        //largest num 

        int largest = arr[0];

        for(int i = 1 ; i <arr.length ; i++){
         
          if (arr[i]>largest) {
              largest=arr[i];
          }
        };
        System.out.println("lergest num is" + largest);

        //smallest num 

        int smallest = arr[0];

        for(int i =1 ; i <arr.length ; i++){
          if (arr[i]<smallest) {
            smallest = arr[i];
          }
        };
        System.out.println("smallest num is"+ smallest);


  //second highest 
     int secondHighest = Integer.MIN_VALUE;
         
     for(int i = 0 ; i<arr.length ; i++){
      if (arr[i] >secondHighest && arr[i]<largest) {
        secondHighest = arr[i];
      }
     };

     System.out.println("second highest is " +secondHighest);
        
   

  }
}
