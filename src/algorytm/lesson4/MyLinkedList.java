package algorytm.lesson4;

public class MyLinkedList {

//    private class Iterator {
//        public void reset() {}
//        public ListNode next() {}
//        public ListNode getCurrent() {}
//        boolean atEnd() {}
//        void insertBefore() {}
//        void insertAfter() {}
//        ListNode deleteCurrent() {}
//        ListNode deleteAfter() {}
//    }
/*
 **** Реализовать класс итератора
 **** Написать программу, использующую двусвязный список через методы итератора
*/
    private ListNode head;
    //private ListNode tail;
//    private int size;

    protected MyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String name, int age) {
        ListNode newNode = new ListNode(name, age);
        newNode.next = head;
        head = newNode;
    }

    public ListNode pop() {
        if (isEmpty()) return null;
        ListNode tmp = head;
        head = head.next;
        return tmp;
    }

    public ListNode find(ListNode in) {
        ListNode current = head;
        while (!current.equals(in)) {
            if (current.next == null) return null;
            else current = current.next;
        }
        return current;
    }

    public ListNode delete(String name) {
        ListNode current = head;
        ListNode previous = head;
        while (!current.name.equals(name)) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == head)
            head = head.next;
        else
            previous.next = current.next;

        return current;
    }

    @Override
    public String toString() {
        ListNode current = head;
        StringBuilder sb = new StringBuilder("[ ");
        while (current != null) {
            sb.append(current.toString());
            current = current.next;
            sb.append((current == null) ? " ]" : ", ");
        }
        return sb.toString();
    }
}
