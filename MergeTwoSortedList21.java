/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                ListNode newone = new ListNode(curr1.val);
                temp.next = newone;
                temp = newone;
                curr1 = curr1.next;
            }else{
                ListNode newone = new ListNode(curr2.val);
                temp.next = newone;
                temp = newone;
                curr2 = curr2.next;
            }
        }
        while(curr1!=null){
            ListNode newone = new ListNode(curr1.val);
                temp.next = newone;
                temp = newone;
                curr1 = curr1.next;
        }
        while(curr2!=null){
            ListNode newone = new ListNode(curr2.val);
                temp.next = newone;
                temp = newone;
                curr2 = curr2.next;
        }
        return dummy.next;
    }
}