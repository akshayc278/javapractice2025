import java.util.ArrayList;
import java.util.List;

public class demo2 {
    static int count=0;
    static boolean[][] dp= new boolean[4][4];
    public static boolean getAllSubArray(int []arr,int start ,int end,int k) {
        if (start > end || end >= arr.length)
            return false;
        if (dp[start][end])
            return true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (max - min == k) {
            count++;
        }
        //System.out.println();

        dp[start + 1][end] = getAllSubArray(arr, start + 1, end, k);
        dp[start][end + 1] = getAllSubArray(arr, start, end + 1, k);
        return false;

    }
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(2);l.add(4);l.add(6);
        int k=2;
        int[]arr={2,6,4};
        getAllSubArray(arr,0,0,k);
        System.out.println(count);

    }
    }



