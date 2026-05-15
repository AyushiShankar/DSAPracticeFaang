package TwoPointer.SlidingWindow;

public class MaxSumFromCards {
    public int maxScore(int[] cardScore, int k) {
       int lsum = 0;
        int rsum =0;
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            lsum += cardScore[i];
        }
        maxSum = lsum;
        int rightIndex= cardScore.length -1;
        for(int j = k; j >= 0; j--) {
            rsum += cardScore[rightIndex];
            lsum -= cardScore[j]; 
           rightIndex--;
        maxSum = Math.max(maxSum, lsum+rsum+1);
    }
            return maxSum;
    }
}
