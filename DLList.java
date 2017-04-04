/**
 * Created by huzaifa.aejaz on 4/3/17.
 */
public class DLList {
    DLNode head;
    DLNode tail;
    int size;

    public DLList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    public DLNode getHead()
    {
        return head;
    }
    public void setTail(DLNode node)
    {
        tail = node;
    }
    public DLNode getTail()
    {
        return tail;
    }
    public void InsertFront(int data)
    {
        DLNode newNode = new DLNode(data,null, head);
        head = newNode;
        if(tail == null){tail = newNode;}

        size++;
    }

    public void DLNode_Insert_Middle(int data, int position, DLNode head) {
        DLNode CurrNode = head;
        DLNode PrevNode = null;

        // Find the postion of the item where we are going to insert
        int pos = 0;
        while (pos < position) {
            if (pos == position - 1)
                PrevNode = CurrNode;
            CurrNode = CurrNode.next; //point to the next element until the position is reached
            pos++;//increment
        }
        DLNode NewNode = new DLNode(data, PrevNode, CurrNode);
        PrevNode.next = NewNode;
        CurrNode.prev = NewNode;
        size++;

    }
    public void DLNode_InsertNext(int data, DLNode tail)
    {
        //DLNode curNode = tail;

       DLNode newNode = new DLNode(data, tail, null);
        if(tail != null){tail.next = newNode;}
        setTail(newNode);
        size++;
    }

    public void PrintList(DLNode reader)
    {
        while(reader.next != null)
        {
            System.out.println(reader.item);
            reader = reader.next;
        }
        System.out.println(reader.item);
    }
}
