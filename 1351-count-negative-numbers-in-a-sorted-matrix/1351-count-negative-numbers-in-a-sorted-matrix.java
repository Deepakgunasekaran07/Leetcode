class Solution {
    public int countNegatives(int[][] grid) {
        int count=0,cols=grid[0].length,j=cols - 1;
        for (int[] row:grid) {
            while (j>=0&&row[j]<0) j--;
            count+=cols-1-j;
    }
    return count;
    }
}