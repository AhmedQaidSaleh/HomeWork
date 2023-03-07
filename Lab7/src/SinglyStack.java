public class SinglyStack <E> implements Stack<E>{
    Singly<E>list= new Singly<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.first();
    }
// ---- Q1 ----
public void signatureTra(SinglyStack n,SinglyStack b){
        while (!list.isEmpty())
            b.push(n.pop());

}
// ----- Q2 -----
public void removell(){
        while (!isEmpty())
            pop();
}
}
