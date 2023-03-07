public class DoublyStack<E>implements Stack {
    Doubly_linked<E> m = new Doubly_linked<>();
    @Override
    public int size() {
        return m.size();
    }

    @Override
    public boolean isEmpty() {
        return m.isEmpty();
    }

    @Override
    public void push(Object o) {
         m.addLast((E) o);
    }

    @Override
    public E pop() {
        return m.removeFirst();
    }

    @Override
    public E top() {
        return m.first();
    }
}
