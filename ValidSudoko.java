import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoko {
    public static void main(String[] args) 
    {
        char[][] board= {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};


        int rows = board.length;
        int columns = board[0].length;
        HashSet<Character> hash = new HashSet<>();

        Boolean ans = true;
        a:
        for(int i=0 ; i <rows ; i++ )
        {
            b:
            for(int j=0; j < columns ; j++)
            {
                if((board[i][j] != ',')&&( hash.contains(board[i][j]) || board[i][j] < 0 || board[i][j] >9))
                {
                    System.out.println("conatins"+ hash.contains(board[i][j]));
                    System.out.println("less"+ (board[i][j] < 0) + board[i][j]);
                    System.out.println("greater"+ (board[i][j]> 9)+ board[i][j]);
                  ans = false;
                  break a;
                }
                else
                {
                    hash.add(board[i][j]);
                }
            }
            System.out.println("before deletion"+ hash.size());
            hash.clear();
            System.out.println("after deletion"+ hash);
        }
        
        System.out.println(ans);

    }
}
