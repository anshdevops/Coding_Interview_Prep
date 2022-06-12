package Popular;

import LinkedList.LinkList;

public class ReverseLinkListIteration {


    public static void main(String[] args) {

        LinkList list= new LinkList(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);


        System.out.println("--------------------------");

        list.printLinkedList();

        list.printLinkedList();

        list.printLinkedList();


        System.out.println("After Reversing");

        LinkList cur=list;
        LinkList next=null;
        LinkList prev=null;

        while(cur!=null)

        {
            prev=cur;
            next=cur.next;



        }


        list.printLinkedList();


    }


        //






    }
