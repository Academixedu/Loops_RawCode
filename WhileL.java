public class WhileL{
  public static void main(String[] args) {
    int incrementCounter = 0; 
    int incrementLimit = 5;   
    System.out.println("Using increment operator:");
    while (incrementCounter < incrementLimit) {
        System.out.println("Incrementing: " + incrementCounter);
        incrementCounter++; 
    }
    int decrementCounter = 10;
    int decrementLimit = 5;    
    System.out.println("Using decrement operator:");
    while (decrementCounter > decrementLimit) {
        System.out.println("Decrementing: " + decrementCounter);
        decrementCounter--; 
    }
}
}
