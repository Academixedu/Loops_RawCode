import java.util.*;
public class DoWhile{
// Prepare a DoWhile Loop Using an Increment Operator 
  // Preapare a DoWhile Loop Using an Decrement Operator
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();

    do{
      System.out.println(n);
      n--;
    }while(n>=0);

    do{
      System.out.println(n);
      n++;
    }while(n<=20);
  }
}
