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
    public ListNode oddEvenList(ListNode head) {
        if(head==null|| head.next==null)return head;
        ListNode p= head;
        ListNode q= head.next;
        ListNode temp1=p;
        ListNode temp2=q;
        while(p.next!=null&&q.next!=null){
             
            p.next=p.next.next;
            q.next=q.next.next;
            p=p.next;
            q=q.next;    
            
        }
        p.next=temp2;
        return temp1;
    }
}