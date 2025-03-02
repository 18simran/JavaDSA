public class circularQueue {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;
    int end = 0;
    int front = 0;
    private int size =0 ;
    public circularQueue()
    {
        this(DEFAULT_SIZE) ;
    }
    public circularQueue(int size)
    {
        this.data = new int[size] ;
    }
    public boolean isFull()
    {
        return size == data.length ;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean insert(int item)
    {
        if (isFull())
        {
            return false ;
        }
        data[end++] = item ;//insert the item at end and then increment end
        end = end % data.length ;
        size++;
        return true ;
    }
    public int remove() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is empty") ;
        }
        int removed = data[front++] ;
        front = front % data.length ;
        size-- ;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty())
        {
            throw new Exception("Queue is empty") ;
        }
        return data[front] ;
    }
    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        int i =  front ;
        do {
            System.out.print(data[i] + " ");
            i++ ;
            i %= data.length;
        }while (i != end);
        System.out.print("END");
        System.out.println();}
    public static void main(String[] args) throws Exception {
        circularQueue cq = new circularQueue(5) ;
        cq.insert(5);
        cq.insert(10);
        cq.insert(15);
        cq.insert(20);
        cq.insert(25);
        cq.display();
        cq.remove();
        cq.display();
        int first = cq.front() ;
        System.out.println(first);
        cq.insert(30);
        cq.display();
    }
}
