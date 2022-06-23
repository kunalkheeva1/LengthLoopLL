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
                //if they meet i will introduce the count and will move the slow one by one
                int count = 1;
                slow =slow.next;
                //until the slow reaches fast again
                while (fast != slow) {
                    //add the count
                    count++;
                    //move the slow
                    slow = slow.next;

                }return count;   //return the count
            }
        }return 0;  //else return 0
    }

    public static void main(String[] args) {

    }
}
