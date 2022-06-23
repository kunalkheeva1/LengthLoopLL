public class LengthLoopLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //method for the cycle
    public static int count(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int count = 1;
                slow =slow.next;
                while (fast != slow) {
                    count++;
                    fast = fast.next;

                }return count;
            }
        }return 0;
    }

    public static void main(String[] args) {

    }
}
