package Popular;

import LinkedList.LinkList;

public class ReverseLinkedListRecursion {

    static LinkList head;
    public static void main(String[] args) {
        LinkList list= new LinkList(1);
        head=list;

        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);





        ReverseLinkedListRecursion reverseLinkedListRecursion
                =new ReverseLinkedListRecursion();
        reverseLinkedListRecursion. reverseList(null,list);
        head.printLinkedList();


    }
      void reverseList(LinkList prev,LinkList cur){


        if (cur!=null) {
            reverseList(cur,cur.next);
            cur.next=prev;
        }

        else  head=prev;



     }



}
