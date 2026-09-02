import java.util.*;

public class Q_02 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);

            carry = sum / 10;

            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        ListNode l1 = null;
        ListNode tail1 = null;

        for (int i = 0; i < n1; i++) {

            int value = sc.nextInt();

            ListNode node = new ListNode(value);

            if (l1 == null) {
                l1 = node;
                tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        int n2 = sc.nextInt();

        ListNode l2 = null;
        ListNode tail2 = null;

        for (int i = 0; i < n2; i++) {

            int value = sc.nextInt();

            ListNode node = new ListNode(value);

            if (l2 == null) {
                l2 = node;
                tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }

        Q_02 obj = new Q_02();

        ListNode answer = obj.addTwoNumbers(l1, l2);

        while (answer != null) {
            System.out.print(answer.val + " ");
            answer = answer.next;
        }

        sc.close();
    }
}