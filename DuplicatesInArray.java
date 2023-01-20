
// returns true if array contains any duplicate
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {

    public static boolean hasDuplicates1(int[] arr)
    {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        HashSet<Integer> set = new HashSet<>(list);

        Boolean b = (set.size() != list.size())? true: false; // set always contains unique elements
        return b;
    }

    public static boolean hasDuplicates2(int[] ints)
    {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, Arrays.stream(ints).boxed().toArray(Integer[]::new));
        Map<Integer, Integer> mapOddNumbers = list.parallelStream().distinct().collect(Collectors.toMap(Function.identity(), y -> 0));
        for(int i : ints)
        {
            for(Integer j : mapOddNumbers.keySet())
            {
                if (j == i)
                {
                    mapOddNumbers.put(i, mapOddNumbers.containsKey(i) ? mapOddNumbers.get(i) + 1 : 1);
                }
            }
        }
        Boolean b = false;
        
        
        for( Integer j: mapOddNumbers.keySet())
        {
            b= (mapOddNumbers.get(j) >1) ? true : false ;
            if(b)
            {
                return true ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(hasDuplicates1(arr));
        System.out.println(hasDuplicates2(arr));
    }
}
