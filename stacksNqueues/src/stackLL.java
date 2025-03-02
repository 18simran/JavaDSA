public class stackLL {
    private Node head ;
    private int size ;
    public  stackLL()
    {
        this.size = 0 ;
    }
    public void push(int val)
    {
        Node node = new Node(val) ;
        node.next = head ;
        head = node ;
        size++ ;
    }
    public void pop()
    {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next ;

        size-- ;
    }
    public int peek()
    {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val ;
    }
    public void display()
    {
        Node temp  = head;
        while(temp != null){
            System.out.print("<-- "+ temp.val);
            temp = temp.next ;
        }
        System.out.println();
    }
    private class Node
    {
        private int val ;
        private Node next ; //Declares a reference variable next of type Node.
        // This will store the reference to the next node in the list.
        public Node(int val)
        {
            this.val = val ;
        }
        public Node(int val, Node next)
        {
            this.val = val ;
            this.next = next ;
            System.out.println(this.val);
        }
    }
    public static void main(String[] args) {
        stackLL s = new stackLL() ;
        s.push(5);
        s.push(10);
        s.push(15);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.push(5);
        s.push(10);
        s.push(15);
        s.display();
        System.out.println(s.peek());
    }
}
