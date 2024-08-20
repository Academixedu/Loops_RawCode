public class WhileL{
//1) Prepare a While Loop Using ++ operator
//2) Prepare a While Loop using -- operator
  // Number Should be reduced by 2 on every iteration
  public static void main(String[] args) {
   System.out.println("increase");
   int dosent=1;
   do{
    System.out.println("Hii" +dosent);
    dosent++;
   }
      while(dosent<=10);

      System.out.println("decrease");
      int dosome=10;
      do{
        System.out.println("Hii"+dosome );
       dosome= dosome-2;
      }
      while (dosome>=2);
        
  
    }
  }
