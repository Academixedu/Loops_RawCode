import java.util.Scanner;
public class ForL {
  public static void main(String[] args) {
    Scanner ss=new Scanner (System.in);
    System.out.print("enter number for its table :");
      int number = ss.nextInt();

      // For loop using increment operator
      System.out.println("Multiplication table using increment:");
      for (int i = 1; i <= 10; i++) {
          System.out.println(number + " x " + i + " = " + (number * i));
      }

      // For loop using decrement operator
      System.out.println("\nMultiplication table using decrement:");
      for (int i = 10; i >= 1; i--) {
          System.out.println(number + " x " + i + " = " + (number * i));
      }
  }
}
