public class WhileL{
//1) Prepare a While Loop Using ++ operator
//2) Prepare a While Loop using -- operator
  // Number Should be reduced by 2 on every iteration
  public static void main(String[] args) {
    int i=1;
    while (i<=10) {
      System.out.println("Increment" +i);
      i++;
    }
    int j=10;
    while (j>1) {
      System.out.println("Decrement:" +j);
      j=j-2;      
    }
  }  
  
}
