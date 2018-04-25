package algorytm.lesson4;



public class FourMain {
    public static void main(String[] args) {
//        MyLinkedList mll = new MyLinkedList();
//        mll.push("Ivan", 32);
//        mll.push("Vasiliy", 30);
//        mll.push("Petr", 31);
//        mll.push("Fedor", 33);
//        mll.push("Pavel", 34);
//        mll.push("Maxxim", 35);
//        mll.push("Igor", 36);
//
//        System.out.println(mll);
//
//        System.out.println("found: " + mll.find(new ListNode("Ivan", 987)));
//        System.out.println("deleted: " + mll.delete("Ivan"));
//
//        while (!mll.isEmpty())
//            System.out.println(mll.pop());

        LinkedListForItrerator list = new LinkedListForItrerator();
        LinkIterator itr = new LinkIterator(list);
        itr.insertAfter("name_1", 30);
        itr.insertBefore("name_2", 35);
        itr.insertBefore("name_3", 40);
        itr.insertBefore("name_4", 45);

        list.display();

        System.out.println("конец? " + itr.atEnd());

        System.out.println("getCurrent?");
        itr.getCurrent().displayLink();

        System.out.println("deleteCurrent");
        itr.deleteCurrent();
        list.display();

        System.out.println("insertBefore");
        itr.insertBefore("name_5", 50);
        list.display();

        System.out.println("reset + getCurrent");
        itr.reset();
        itr.getCurrent().displayLink();

        System.out.println("nextLink + getCurrent");
        itr.nextLink();
        itr.getCurrent().displayLink();

        System.out.println("insertAfter");
        itr.insertAfter("name_6", 60);
        list.display();
    }
}
