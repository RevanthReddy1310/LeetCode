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
    public static ArrayList<Integer> linkedListToArrayList(ListNode head) {  
        ArrayList<Integer> arrayList = new ArrayList<>();  
        ListNode current = head;  

        while (current != null) {  
            arrayList.add(current.val);  
            current = current.next;  
        }  

        return arrayList;  
    }  
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arrayList = linkedListToArrayList(head);  
        Collections.sort(arrayList);
        ListNode sortedhead = null;
        ListNode current = null;
        for(Integer value:arrayList){
            ListNode newNode = new ListNode(value);
            if(sortedhead==null){
                sortedhead = newNode;
                current = sortedhead;
            }else{
                current.next = newNode;
                current = current.next;
            }
        }
        return sortedhead;

    }
}