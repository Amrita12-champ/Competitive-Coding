import java.util.HashSet;


class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {

    public Node makeUnion(Node head1, Node head2) {

        HashSet<Integer> visited = new HashSet<>();

        Node dup = new Node(-1);
        Node currentTail = dup;

        Node ptr1 = head1;

        while (ptr1 != null) {

            if (visited.add(ptr1.data)) {
                currentTail.next = new Node(ptr1.data);
                currentTail = currentTail.next;
            }

            ptr1 = ptr1.next;
        }

        Node ptr2 = head2;

        while (ptr2 != null) {

            if (visited.add(ptr2.data)) {
                currentTail.next = new Node(ptr2.data);
                currentTail = currentTail.next;
            }

            ptr2 = ptr2.next;
        }

        return dup.next;
    }
}
public class UnionOfTwoLinkedLists {

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 1st linkedlist
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        // 3 -> 4 -> 5 -> 6 2nd linkedlist
        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(6);

        Solution obj = new Solution();
        Node result = obj.makeUnion(head1, head2);
        System.out.print("Union: ");
        Node current = result;
        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }
    }
}