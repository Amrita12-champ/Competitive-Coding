class Node2 {
    int data;
    Node2 next;
    Node2(int d) {
        data = d;
        next = null;
    }
}
class Solution2 {
    Node2 sortedMerge(Node2 head1, Node2 head2) {
        Node2 dummy = new Node2(-1);
        Node2 tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }
}

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        // 1 -> 3 -> 5
        Node2 head1 = new Node2(1);
        head1.next = new Node2(3);
        head1.next.next = new Node2(5);
        // 2 -> 4 -> 6
        Node2 head2 = new Node2(2);
        head2.next = new Node2(4);
        head2.next.next = new Node2(6);

        Solution2 obj = new Solution2();

        Node2 result = obj.sortedMerge(head1, head2);

        System.out.print("Merged List: ");

        Node2 current = result;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }
    }
}