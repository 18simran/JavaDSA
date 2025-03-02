public class DynamicStack extends CustomStack {
    //dyamic stack could never be full
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }
    @Override
    public boolean push(int item) throws Exception {
        // this takes care of it being full
        if (this.isFull())
        {
            int[] temp  = new int[data.length * 2] ;
            for (int i = 0 ;i <  data.length ;i++)
            {
                temp[i] = data[i] ;
            }
            data = temp ;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
    public static void main(String[] args) throws Exception {
        CustomStack st = new DynamicStack(4) ;
        st.push(5) ;
        st.push(10) ;
        st.push(15) ;
        st.push(20) ;
        st.push(25) ;
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
}
