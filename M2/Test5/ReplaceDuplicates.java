package M2.Test5;

import M2.Node;

public class ReplaceDuplicates {

    public static void changeLL(Node<Integer> head) {
        if (head == null || head.next == null) {
            return;
        }
        int max = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        boolean done[] = new boolean[max + 1];

        temp = head;
        while (temp != null) {
            if (done[temp.data]) {
                temp.data = max + 1;
                max++;
            } else {
                done[temp.data] = true;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        changeLL(head);
        Node.printLL(head);
    }
}
