import java.util.*;
public class ForL{
// Prepare a For Loop Using an Increment Operator 
  // Prepare a For Loop Using Decrement Operator
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();

    for(int i=0;i<=n;i++){
      System.out.println("Increment:"+i);
    }

    for(int i=n;i>0;i--){
      System.out.println("Decrement:"+i);
    }
  }
  
}
