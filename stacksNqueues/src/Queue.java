public class Queue {
    public static final int DEFAULT_SIZE = 10 ;
    private final int[] data;
    int end = 0 ;
    public Queue()
    {

        this( DEFAULT_SIZE);
    }
    public Queue(int size)
    {
        this.data = new int[size] ;
    }
    public boolean isFull()
    {
        return end == data.length ;
    }
    public boolean isEmpty()
    {
        return end == 0 ;
    }
public boolean insert(int item) throws Exception{
if (isFull())
{
     throw new Exception("full hai") ;
}
data[end++] = item ;
    System.out.println(end);
    System.out.println(data.length);
return true ;
}
public int remove() throws Exception
{
    if (isEmpty())
    {
        throw new Exception("Queue is empty") ;
    }
    int removed = data[0] ;
    for (int i = 1 ;i < end ;i++)
    {
        data[i-1] = data[i] ;

    }
    end-- ;
    return removed;
}
public int front() throws Exception{
        if (isEmpty())
        {
            throw new Exception("Queue is empty") ;
        }
        return data[0] ;
}
public void display()
{
    for (int i = 0; i < end ;i++)
    {
        System.out.print(data[i] + " ");
    }
    System.out.println("END");
}
    public static void main(String[] args) throws Exception {
        Queue q =new Queue() ;
        q.insert(5) ;
        q.insert(15) ;
        q.insert(20) ;
        q.insert(25) ;
        q.insert(25) ;
        q.insert(25) ;

        q.display();
        int r = q.remove();
        System.out.println("removed" + r);
        q.display();
        q.front() ;
        q.display();
    }
}
