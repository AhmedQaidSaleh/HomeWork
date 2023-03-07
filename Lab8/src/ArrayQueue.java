//import java.util.Queue;

public class ArrayQueue<E> implements Queue<E> {
    E data[];
    int sz = 0;
    int f = 0;
    static final int CAPACITY = 100;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public void enqueue(E element) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Queue is Full");
        int avail = (f + sz) % data.length;
        data[avail] = element;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E del= data[f];
        data[f]= null;
        f=(f+1)%data.length;
        sz--;
        return del;
    }
    // ----- Q1  ------
    public E rotate(){
        E e = data[f];
        data[f] =data[sz];
        data[sz]=e;

        return e;
    }
    // -----Q2 ----
    public  void clone(ArrayQueue arr){
        for (int i = 0; i <=size() ; i++) {
            arr.enqueue(dequeue());

        }
    }


}