import java.util.Arrays;

// two strings -> anagram if have different order but same characters

public class ValidAnagram {
    public static void main(String[] args)
    {
    
        String s = "anagram";
        String t = "nagaram";

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Boolean ans = (Arrays.equals(arr1,arr2))? true : false;
        System.out.println(ans); 

    }
}
