package main;


/*Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Implement the Solution class:

Solution(ListNode head) Initializes the object with the integer array nums.
int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.


Example 1:


Input
["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
[[[1, 2, 3]], [], [], [], [], []]
Output
[null, 1, 3, 2, 2, 3]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.getRandom(); // return 1
solution.getRandom(); // return 3
solution.getRandom(); // return 2
solution.getRandom(); // return 2
solution.getRandom(); // return 3
// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.


Constraints:

The number of nodes in the linked list will be in the range [1, 104].
-104 <= Node.val <= 104
At most 104 calls will be made to getRandom.


Follow up:

What if the linked list is extremely large and its length is unknown to you?
Could you solve this efficiently without using extra space?*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRandomNode {

    /*List<Integer> list = new ArrayList<>();
    public LinkedListRandomNode(ListNode head) {
        while(head!=null)
        {
            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        // defining the range for the index
        int random_index = (int)((Math.random()*(list.size())));
        return list.get(random_index);
    }*/
}
