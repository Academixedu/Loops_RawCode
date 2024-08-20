public class WhileL {
  public static void main(String[] args) {
      // 1) Prepare a While Loop Using ++ Operator
      int i = 0;
      int sum = 0;
      while (i <= 100) {
          sum = sum + i;
          i += 2;  
      }

      System.out.println("The sum of numbers from 0 to 100, incrementing by 2 each iteration, is: " + sum);

      // 2) Prepare a While Loop to Decrease the Number by 2 on Each Iteration
      int a = 20;
      System.out.println("Decreasing the number by 2 on each iteration:");
      while (a > 0) {
          System.out.println("Current value: " + a);
          a -= 2;  
      }
  }
}



  


  
  

