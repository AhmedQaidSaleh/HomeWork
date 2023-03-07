public class Circularly<E> {


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
     private Node<E> tail = null;
 private int size = 0;
 public Circularly( ) { }
         public int size( ) { return size; }
 public boolean isEmpty( ) { return size == 0; }
 public E first( ) {
         if (isEmpty( )) return null;
         return tail.getNext( ).getElement( );
         }
 public E last( ) {
         if (isEmpty( )) return null;
         return tail.getElement( );
         }
         public void rotate(){
     if (tail!=null)
         tail=tail.getNext();
         }
         /*
         public void rotate( ) {
         if (tail != null)
             tail = tail.getNext( );
         }*/

 public void addFirst(E e) { // -----Q1------
         if (size == 0) {
             tail = new Node<>(e, null);
             tail.setNext(tail);
             } else {

             tail.setNext(new Node<>(e, tail.getNext( )));
             }
         size++;
         }
  public void addLast(E e) {
         addFirst(e);
         tail = tail.getNext( );
         }

 public E removeFirst( ) { // removes and returns the first element
         if (isEmpty( )) return null; // nothing to remove
         Node<E> head = tail.getNext( );
         if (head == tail) tail = null; // must be the only node left
         else tail.setNext(head.getNext( )); // removes ”head” from the list
         size--;
         return head.getElement( );
 }
 // ---------------- Q2 -----------------
public void sizz(){
     int n =1;
   Node<E> s =tail.next;
    while (s!=tail){
        n++;
        s=s.next;
     }
    System.out.println(n);
}

    //-----------  Q3  ---------------
    public boolean equal(Circularly ob5) {
     if (getClass() == ob5.getClass()) {
     if (size() == ob5.size()) {
     Node<E> m1 = tail.next;
     Node<E> m2 = ob5.tail.next;
     while (m1!=m1.next && m2!=m2.next) {
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
     //------  Q4 ------
    public boolean equal_LM(Circularly L){
     Node <E> m1=tail.next;
        Node <E> m2=L.tail.next;
        while (m2 !=L.tail){
            if (m1.element==m2.element)
              // System.out.println("the Staring point is the same");
                break;
m2 =m2.next;
        }
        while (m1.element==m2.element && m2 !=L.tail){
            m1=m1.next;
            m2=m2.next;
        }
        if (m1.element!=m2.element)
            return false;


        return false;
    }

    //----------Q5------
    public void Lisit_L(Circularly M,Circularly N){
     if (!isEmpty())
         if (size %2==0){
             int n =1;
             while (n<=size/2){
                 tail=tail.next;
                 M.addFirst(tail.element);
                 n++;
             }while (n<=size){
                 tail=tail.next;
                 N.addFirst(tail.element);
                 n++;             }
         }
    }
}
