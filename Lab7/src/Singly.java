

public class Singly<E> {
    private class Node<E> {
        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

    public void setNext(Node<E> n) {
        next = n;
    }}

    public Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    // update methods
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    //----------  Q1  --------
    public boolean equal(Singly ob2) {
        if (getClass() == ob2.getClass()) {
            if (size() == ob2.size()) {
                Node<E> m1 = head;
                Node<E> m2 = ob2.head;
                while (m1!=null & m2!=null) {
                    if (m1.element != m2.element){
                        return false;
                    }
                    m1 = m1.next;
                    m2 = m2.next;
                }return true;
            }return false;
        }
        return false;

    }


    //----------- Q2 --------
    public void finding (){
        Node<E> n =head.next;
        while (n!=null){
            System.out.println(n.element);
            n=n.next;
        }
    }

// -------------- Q3 -----
public void getsize (){
    Node<E> n =head;
    int o = 1;

    while (n!=tail){
        o++;
        n=n.next;
    }
    System.out.println(o);
}
    // ---------  Q4-------
    public void rotate(){
        E m= head.getElement();
        head.element=tail.getElement();
        tail.element=m;
    }
    //-------- Q5 -------
    public void concatenating(Singly list1,Singly list2){

        while (!list1.isEmpty()){
            addLast((E) list1.removeFirst());
        }
        while (!list2.isEmpty()){
            addLast((E) list2.removeFirst());
        }

    }
    //-------- Q6----
    public void reversing(){
        int r =0;
        Singly re = new Singly();
        while (r>=size){
           re.addLast(removeFirst());
           addFirst( (E)re.removeFirst());
            r++;

        }
    }
}
