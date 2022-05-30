/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
    let l3 = new ListNode();
    let tmp = l3;
    let c = 0;
    
    while (l1 || l2 || c) {
        let f = !l1 ? 0 : l1.val;
        let s = !l2 ? 0 : l2.val;
        let sum = f + s + c; 
        
        tmp.next = new ListNode();
        tmp = tmp.next;
        
        tmp.val = sum < 10 ? sum : sum - 10;
        c = sum >= 10 ? 1 : 0;
        
        l1 = l1 ? l1.next : 0;
        l2 = l2 ? l2.next : 0;     
    }
    
    return l3.next;
};