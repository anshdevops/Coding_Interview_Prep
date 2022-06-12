package LinkedList;

public class LinkList {

     public int data;
     public LinkList next;


     public LinkList(int data) {
          this.data = data;

          System.out.println("Added "+data);
     }



      public void addData(int data){


           if(next==null)  next=new LinkList(data);

           else {
                LinkList tempHead = next;


                while (tempHead.next != null) {
                     tempHead = tempHead.next;
                }


                tempHead.next = new LinkList(data);
           }
     }

     public  void printLinkedList(){

          System.out.println("Printing Linked List");

          LinkList tempHead=next;

          System.out.println(this.data);

          while (tempHead!=null){
               System.out.println(tempHead.data);
               tempHead=tempHead.next;
          }
     }


}
