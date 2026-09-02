class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        //boolean[] arr=new boolean[candies.length];
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                //arr[i]=true;
                list.add(true);
            }
            else{
                //arr[i]=false;
                list.add(false);
            }
        }
        // List<Boolean> list = new ArrayList<>();
        // for (boolean value : arr) {
        //     list.add(value);
        // }
        return list;
    }
}