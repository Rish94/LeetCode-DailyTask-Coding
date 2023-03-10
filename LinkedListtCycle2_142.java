public class Solution {

	//function to detect whether it contains a cycle or not
	//floyd cycle detection/slow fast pointer approach
    public ListNode detect(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    } 
	//main function
    public ListNode detectCycle(ListNode head) {
        ListNode temp=detect(head);
        if(temp==null){
            return null;
        }
        ListNode beg=head;
        while(beg!=temp){
            beg=beg.next;
            temp=temp.next;
        }
        return beg;
    }
}