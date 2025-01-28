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

        //Returning lists if one or both list is empty
        if(list1 == null && list2 == null){
            return list1;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        //New Sorted list
        ListNode queryingDummy = new ListNode();

        //New Head for result
        ListNode newHead = queryingDummy;
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                queryingDummy.next = list1;
                list1 = list1.next;
            }else{
                queryingDummy.next = list2;
                list2 = list2.next;
            }
            queryingDummy= queryingDummy.next;
        }

        //Setting remaing list in the resulted sorted list
        if(list1==null && list2!=null){
            queryingDummy.next = list2;
        }else if(list1!=null && list2==null){
            queryingDummy.next = list1;

        }

        return newHead.next;
        
    }
}