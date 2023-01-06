

// ABCDEFGHIJKLMN

//   A   E   I   M             A       E       I       M
//   B D F H J L N       OR      B   D   F   H   J   L   N
//   C   G   K                     C       G       K


public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "ABCDEFGHILKLMN";
        int rows = 3;

        if(rows==1)
        {
            System.out.println(s);
            return ;
        }
        
        StringBuilder[] matrix = new StringBuilder[rows];
        for(int i=0; i<rows ; i++)
        {
            matrix[i] = new StringBuilder();
        }

        char[] array = s.toCharArray();
        int length = array.length;
        int k =0;

        while(k<length)
        {
            for(int i=0; i< rows && k<length;i++)
            {
                matrix[i].append(array[k]);
                k++;
            }
            for(int j= rows-2 ; j> 0 && k<length  ;j--)
            {
                matrix[j].append(array[k]);
                k++;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<matrix.length;i++)
        {
            res.append(matrix[i]);
        }

        System.out.println(res);
        return ; //AEMBDFHJLNCGK

    }
}
