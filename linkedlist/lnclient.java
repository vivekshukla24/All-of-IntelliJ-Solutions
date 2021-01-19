package linkedlist;

public class lnclient {
    public static void main(String[] args) {


        linklist list = new linklist();
        list.insertfirst(12);
        list.insertfirst(13);
        list.insertfirst(14);
        list.display();
        list.insertlast(15);
        list.insertlast(16);
        list.insertlast(17);
        list.insertlast(18);
        list.display();
        list.deletefirst();
        list.display();

        list.deletelast();
        list.display();
    }
}
