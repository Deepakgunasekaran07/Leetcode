class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int currentwidth=0;
        for(char c:s.toCharArray()){
            int w=widths[c-'a'];//it will take the index value of the element "If c = 'b' → c - 'a' = 1 → widths[1]"
            if(currentwidth+w > 100){
                line ++;
                currentwidth=w;
            }
            else{
                currentwidth=currentwidth+w;
            }
        }
        return new int []{line,currentwidth};
    }
}