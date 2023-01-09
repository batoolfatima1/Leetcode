public class PalindromeNumber {
    public static void main(String[] args) {
        
        System.out.println(check(123));
    }
    public static boolean check(int num)
    {
        boolean ans = false;
        StringBuilder s1 = new StringBuilder().append(num);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder().append(s1).reverse();
        System.out.println(s2);

        // if(Integer.parseInt(s1.toString()) == Integer.parseInt(s2.toString()))
        // {
        //     ans = true;
        // }
        // else
        //     ans = false;
        ans = (s1.equals(s2))? true : false;
        return ans;

    }
    
}
