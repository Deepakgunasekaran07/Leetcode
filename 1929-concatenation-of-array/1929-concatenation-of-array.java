class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] =new int[nums.length*2];
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[length+i]=nums[i];
        }
        return arr;
    }
}