// import Stack.Stack.SL;

public class stackLink {
    public static void main(String args[]){
        StackedLinkedList s = new StackedLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

    
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public static class StackedLinkedList{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(Object data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        public static Object pop(){
            if(isEmpty()){
                return "Empty Stack";
            }
            Object top = head.data;
            head = head.next;
            return top;
        }

        public static Object peek(){
            if(isEmpty()){
                return "Empty Stack";
            }
            return head.data;
        }
    }


}

