/**
 * Created by huzaifa.aejaz on 4/3/17.
 */
public class DLNode {
    int item;
    DLNode prev;
    DLNode next;

    public DLNode()
    {

    }

    public DLNode(int data) {
        this.item = data;
        this.next = null;
        this.prev = null;

    }

    public DLNode(int data, DLNode prev_loc, DLNode next_loc) {
        this.item = data;
        this.prev = prev_loc;
        this.next = next_loc;
    }

}
