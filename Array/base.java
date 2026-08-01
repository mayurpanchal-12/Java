package Array;
public class base {
  public static void main(String[] args) {
    
    int[] marks = new int[5];
    marks[0]= 23;
    marks[1]= 34;
    marks[3]= 20;
    marks[4]=10;
    System.out.println(marks[1]); 
    System.out.println(marks[2]);

    for(int i = 0 ; i<marks.length; i++){
           System.out.println(marks[i]);
    }
  }
}
