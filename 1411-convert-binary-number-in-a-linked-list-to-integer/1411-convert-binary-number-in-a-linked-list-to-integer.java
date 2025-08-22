class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current=head;
        int sum=0;
        while(current != null){
            sum = (sum * 2) + current.val ;
            current=current.next;
        }
        return sum;
    }
}