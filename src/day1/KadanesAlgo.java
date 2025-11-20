package day1;

public class  KadanesAlgo {
    public static int KadanesAlgo1(int[] nums){

// for maximum continous sub array

        int max = nums[0];
        int curr = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
