class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int length=0;
        for(int i=0;i<n;i++){
                arr[length]=nums[i];
                length++;
                arr[length]=nums[i+n];
                length++;
            
        }
        return arr;
    }
}