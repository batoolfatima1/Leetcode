import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        //int[][] matrix = { {1,2,3,4}, {5,6,7,8},{9,10,11,12} };
        //int[][] matrix = { {1,2,3}, {4,5,6},{7,8,9} };
        int[][] matrix = { {1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},{31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50},{51,52,53,54,55,56,57,58,59,60},{61,62,63,64,65,66,67,68,69,70},{71,72,73,74,75,76,77,78,79,80},{81,82,83,84,85,86,87,88,89,90},{91,92,93,94,95,96,97,98,99,100}};
        int y = matrix.length;
        int x = matrix[0].length;

        int total = x*y;
        int count = 0;
        List<Integer> list = new ArrayList<>(total);

        System.out.println(x + " " +y + " "+ total);

        for(int i=0 ; i<=y-1 && count<total ;i++)
        {
            for(int j=i ; j<x-i && count<total ;j++)
            {
             
                list.add(matrix[i][j]);
                count ++;
            }
         
            for(int j= i+1 ; j < y- Math.pow(2,i) && count<total ; j++)
            {
              
                list.add(matrix[j][x-i-1]);
                if(matrix[j][x-i-1] == 58)
                {
                    System.out.println("i= "+ i +" j= "+ j + " y= " + (y - Math.pow(2,i)) + " " + matrix[j+1][x-i-1]);
                }
                count ++;
            }
            
            for(int j= x-1-i ; j>=i && count<total; j-- )
            {
               
                list.add(matrix[y-1-i][j]);
                count ++;
            }
          for(int j=(int)Math.round(y-1-Math.pow(2,i)); j>i && count<total ; j--)
            {
                list.add(matrix[j][i]);
                count ++;
            }
           
        }


        System.out.println();
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer +" ,");
        }
    }
}
