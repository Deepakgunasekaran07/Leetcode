class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int currentwidth=0;
        for(char c:s.toCharArray()){
            int w=widths[c-'a'];
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