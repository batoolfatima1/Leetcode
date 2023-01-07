// 32 bit integer   [-2^31, 2^31 - 1]


// String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
// try {
//     return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
// } catch (NumberFormatException e) {
//     return 0;
// }

// class Solution {
//     public int reverse(int x) {
//         int rev = 0;
//         while (x != 0) {
//             int pop = x % 10;
//             x /= 10;
//             if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//             if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//             rev = rev * 10 + pop;
//         }
//         return rev;
//     }
// }

public class ReverseInteger {
    public static void main(String[] args) {
        int x= -123456789;
        int rev = 0;
        while (x != 0)
        {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                System.out.println(0); 
                return ;
                }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
               System.out.println(0);
                return ;
            } 
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
        return ; 
    }
}
