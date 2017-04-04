import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        DLList newList = new DLList();
        DLNode node = new DLNode(12);
        newList.head = node;
        newList.tail = node;
       // newList.InsertFront(12);
       // newList.DLNode_InsertNext(12,newList.getTail());
        int[] arrayVals = {17, 14, 16, 18, 22, 45, 65, 23, 45};

        for (int val : arrayVals
                ) {

            newList.DLNode_InsertNext(val, newList.getTail());
        }

        DLNode reader = newList.getHead();
        newList.PrintList(reader);
        System.out.println("_________________");
        newList.DLNode_Insert_Middle(160,3,reader);
        newList.PrintList(reader);
        System.out.println("_________________");
        newList.InsertFront(18);

        newList.PrintList(newList.getHead());



    }
}




