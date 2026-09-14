class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==2){
                sum+=nums[i];
            }
        }
        return sum;
    }
}