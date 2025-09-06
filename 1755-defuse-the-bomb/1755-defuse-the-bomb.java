class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result; 
        }
        int sum = 0;
        int start, end;
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % n]; // 1,2,3-12
            }
            result[0] = sum;
            for (int i = 1; i < n; i++) {
                sum = sum - code[(i % n)]; // 1-7-1,4-(9),
                sum = sum + code[(i + k) % n]; // code[0]-5,4+5+7=16
                result[i] = sum;
            }
        } 
        else {
            k = -k;
            for (int i = 1; i <= k; i++) {
                sum += code[(n - i) % n];
            }
            result[0] = sum;
            for (int i = 1; i < n; i++) {
                sum -= code[(n + i - k - 1) % n];
                sum += code[(i - 1 + n) % n];
                result[i] = sum;
            }
        }
        return result;
    }
}
