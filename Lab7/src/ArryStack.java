public class ArryStack<E>implements Stack<E>
{
    private int t=-1;
    static final int CAPACITY =10;
    private E[]data;
    public ArryStack(int c){
        data = (E[]) new Object[c];
    }
    public ArryStack(){
        this(CAPACITY);
    }
    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public void push(E e) {
    if (size()==data.length)
        throw new IllegalStateException("Stack is full");

    data[++t]=e;
    }

    @Override
    public E pop() {
       if (isEmpty())return null;
       E delet =data[t];
       data[t]=null;
       t--;
       return delet;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }
    //----- Q4 -----
    public void cloe(ArryStack Arry)
    {
        ArryStack a =new ArryStack();
        while (!Arry.isEmpty())
            a.push(Arry.pop());
        while (!Arry.isEmpty())
push((E)a.pop());
    }
}
