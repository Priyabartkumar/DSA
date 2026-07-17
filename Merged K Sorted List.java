Concept: Array and Linkedlist which  leads to ArrayList
Level:Hard
Question:23

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.

 Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
 

Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.

 Answer:
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists ==null || lists.length == 0){
            return  null;
        }
     while(lists.length > 1){
            List<ListNode> temp = new ArrayList<>();
            for(int i = 0; i<lists.length; i+=2){
                ListNode l1 = lists[i];
                ListNode l2 = i + 1 < lists.length ? lists[i + 1] : null;
                temp.add(mergeLists(l1, l2));
            }

