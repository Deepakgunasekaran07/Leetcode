class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int prefixSum =0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(prefixSum)) {
                int prevIndex = map.get(prefixSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {  
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}