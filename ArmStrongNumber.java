public class ArmStrongNumber
{
    public static void main(String[] args) {
        for(int i=0; i<=1000; i++)
        {
        int num = i;
        int digits_count =0;
        int sum =0;

        int temp =num;
        // count numbers of digits
        while(temp != 0)
        {
         digits_count ++;
         temp = temp/10;    
        }

        temp =num;

        while(temp !=0)
        {
            int quotient = temp%10;
            sum += Math.pow(quotient, digits_count);
            temp=temp/10;
        }

        if(sum == num)
        {
            System.out.println(num + " is armstrong");
        }
        // else{
        //     System.out.println(num + " is not armstrong");
        // }
        }
        
    }
    
}
