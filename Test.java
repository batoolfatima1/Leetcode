public class Test {
   public static int divideByZero()
    {
     try
     {
         System.out.println("try");
         int x= 4/0;
         return x;
     }
     catch (Excep tion e)
     {
     System.out.println("catch");
     }
     finally
     {
         System.out.println("finally");
         return 88;
     } 
    }
  public static void main(String[] args)
   {
    System.out.println(divideByZero());
  }
}
