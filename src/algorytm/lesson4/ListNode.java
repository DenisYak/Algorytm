package algorytm.lesson4;

public class ListNode {
    //payload
    public String name;
    public int age;

    //meta
    public ListNode next;
    //public ListNode prev;

    protected ListNode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "(Name: " + name + ", age: " + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof ListNode)) return false;
        ListNode other = (ListNode) obj;
        return other.name.equals(this.name) && other.age == this.age;
    }
}
