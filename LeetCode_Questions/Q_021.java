import java.util.*;

public class Q_021 {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        ListNode list1 = null;
        ListNode tail1 = null;

        for (int i = 0; i < n1; i++) {

            int value = sc.nextInt();

            ListNode node = new ListNode(value);

            if (list1 == null) {
                list1 = node;
                tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        int n2 = sc.nextInt();

        ListNode list2 = null;
        ListNode tail2 = null;

        for (int i = 0; i < n2; i++) {

            int value = sc.nextInt();

            ListNode node = new ListNode(value);

            if (list2 == null) {
                list2 = node;
                tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }

        Q_021 obj = new Q_021();

        ListNode answer = obj.mergeTwoLists(list1, list2);

        while (answer != null) {
            System.out.print(answer.val + " ");
            answer = answer.next;
        }

        sc.close();
    }
}