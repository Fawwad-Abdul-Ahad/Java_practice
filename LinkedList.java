public class LinkedList{
    Node head;
    int size;
    public static void main(String [] agrs){
        LinkedList ll = new LinkedList();
        ll.AddFirst("a");
        ll.addLast("e");
        ll.addLast("i");
        ll.addLast("o");
        ll.addLast("u");
        ll.removeFirst();
        ll.removeLast();
        ll.printList();
        System.out.println(ll.getSize());
        ll.removeLast();
        ll.printList();
        System.out.println(ll.getSize());
        ll.reverseLinkedlist();
        ll.printList();


    }
   public class Node{
    Object data;
    Node next;

    Node(Object data){
        this.data = data;
        this.next = null;
        size++;
    }
   }

   public void AddFirst(Object data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
    
   }

   public void addLast(Object data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode; 
    }
    Node currNode = head;
    while (currNode.next!=null) {
            currNode = currNode.next;
    }
    currNode.next = newNode;
   }

   //remove first
   public void removeFirst(){
         if(head == null){
            return;
         }
         head = head.next;
         size--;
   }

   //remove last
   public void removeLast(){
    if(head == null){
        return;
    }
    size--;
    if(head.next == null){
        head = null;
        return;
    }

    Node secondLast = head;
    Node last = head.next;
    while(last.next != null){
        last = last.next;
        secondLast = secondLast.next;
    } 
    secondLast.next=null;

   }


   //print whole list
   public void printList(){
    if(head == null){
        System.out.println("List is empty");
    }
    Node currNode = head;
    while (currNode!=null) {
        System.out.print(currNode.data+ "-->");
        currNode = currNode.next;
    }
    System.out.println("null");
   }

   //prit size
   public int getSize(){
    return size;
   }

   public void reverseLinkedlist(){
    
    if(head.next ==null || head == null){
        return;
    }

    Node prevNode = head;
    Node currNode = prevNode.next;
    while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        // move forward
        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;

   }

   
}