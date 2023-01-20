public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

    int sum=0;
    int maxi = arr[0];
    for(int i=0; i< arr.length; i++)
    {
        sum += arr[i];
        maxi = Math.max(maxi,sum);
        sum = (sum < 0)? 0 : sum;
    }
    System.out.println(maxi);
    }
}
