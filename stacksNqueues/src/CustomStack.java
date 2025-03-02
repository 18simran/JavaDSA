public class CustomStack {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;
    int ptr = -1 ;
    public CustomStack()
    {
        this(DEFAULT_SIZE) ;
    } //Calls the parameterized constructor with DEFAULT_SIZE (which is 10).
  //  This means if a user creates a CustomStack without specifying a size, it defaults to 10.
    public CustomStack(int size)
    {
        this.data = new int[size] ;

    }
    public boolean push(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("Stack is full ") ;
        }
        ptr++ ;
        data[ptr] = item ;
        return true ;
    }
    public int pop() throws Exception {
        if (isEmpty())
        {
            throw new Exception("can't pop from an empty stack!!") ;
        }
        return data[ptr--] ;
    }
    public int peek() throws Exception {
        if (isEmpty())
        {
            throw new Exception("cannot peek from an empty stack") ;
        }
        return data[ptr] ;
    }
    boolean isFull()
    {
        return ptr == data.length - 1 ;
    }
    boolean isEmpty()
    {
        return ptr == -1 ;
    }
    public static void main(String[] args) throws Exception {
      CustomStack st = new CustomStack() ;
        st.push(5) ;
        st.push(10) ;
        System.out.println( st.peek() );
//        st.push(15) ;
//        st.push(20) ;
//        st.push(25) ;
        System.out.println(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
