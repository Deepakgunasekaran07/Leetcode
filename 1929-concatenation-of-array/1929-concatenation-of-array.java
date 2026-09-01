class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l * 2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+l]=nums[i];
        }
        return ans;
    }
}