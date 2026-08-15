package Questions;

public class arm {
  public static void main(String[] args) {
int num = 153;

//get copy of num to check at the last
int  original = num;

//arm var 
int arm = 0;
//another copy to get digits 
int digitnum = num;

//digit counting 
int digits =0;
while (digitnum>0) {
  digits++;
  digitnum--;
}

while(num>0){
  int r = num%10;

arm = arm+(r*r*r);
num=num/10;
};


if(arm==num){
  System.out.println("it is armstrong");
}else{
  System.out.println("no arm"+arm);
}


  }
}
