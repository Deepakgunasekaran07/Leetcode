class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowstart=0;
        double windowsum=0;
        double maximum=Double.NEGATIVE_INFINITY;
        for(int windowend=0;windowend<nums.length;windowend ++){
            windowsum +=nums[windowend];
            if(windowend >=k-1){
                maximum=Math.max(maximum,windowsum);
                windowsum -=nums[windowstart];
                windowstart++;
            }
        }
        return maximum/k;
    }
}