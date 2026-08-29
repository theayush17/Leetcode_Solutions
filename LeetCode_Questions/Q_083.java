import java.util.*;

public class Q_083 {

    // Definition for singly-linked list
    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            // If current and next node have the same value
            if (current.val == current.next.val) {

                // Remove the duplicate node
                current.next = current.next.next;

            } else {

                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Create object
        Q_083 obj = new Q_083();

        // Call method
        head = obj.deleteDuplicates(head);

        // Print answer
        System.out.print("List after removing duplicates: ");

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        sc.close();
    }
}