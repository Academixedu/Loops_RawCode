public class DoWhile{
  public static void main(String[] args) {
    // Prepare a DoWhile Loop Using an Increment Operator 
    int i=1;
    System.out.println("Increment---");
    do{
      System.out.println(" Do while loop "+i);
      i++;
    }while(i<=10);
    // Preapare a DoWhile Loop Using an Decrement Operator 
    System.out.println("Decrement---");
    int j=10;
    do{
      System.out.println("Do while loop "+j);
      j--;
    }while(j>=1);
  }
}
