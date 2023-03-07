
public class Doubly_linked<E> {
   private static class Node<E>{
       E element;
       Node<E> prev;
       Node<E> next;

       public Node(E element, Node<E> prev, Node<E> next) {
           this.element = element;
           this.prev = prev;
           this.next = next;
       }

       public E getElement() {
           return element;
       }

       public void setElement(E element) {
           this.element = element;
       }

       public Node<E> getPrev() {
           return prev;
       }

       public void setPrev(Node<E> prev) {
           this.prev = prev;
       }

       public Node<E> getNext() {
           return next;
       }

       public void setNext(Node<E> next) {
           this.next = next;
       }
   }


    private Node<E> header;
     private Node<E> trailer;
     private int size = 0;
     public Doubly_linked() {
         header = new Node<>(null, null, null); // create header
         trailer = new Node<>(null, header, null); // trailer is preceded by header
         header.setNext(trailer);}

    // ----- Q2 -----
             public int size( ) {
         if (header==null)return 0;
                 int sz = 0;
                 Node<E> e = header;
                 while (e != trailer) {
                     sz++;
                     e = e.next;
                 }
                 return sz;
          }

             public boolean isEmpty( ) { return size == 0; }
             public E first( ) {
         if (isEmpty( )) return null;
         return header.getNext( ).getElement( ); // first element is beyond header
         }
             public E last( ) {
         if (isEmpty()) return null;
         return trailer.getPrev().getElement();
                 }

    public Node addFirst(E e) {
         addBetween(e, header, header.getNext( )); // place just after the header
        return null;
    }
 //∗∗ Adds element e to the end of the list. ∗/
    public void addLast(E e) {
         addBetween(e, trailer.getPrev( ), trailer); // place just before the trailer
         }
 ///∗∗ Removes and returns the first element of the list. ∗/
    public E removeFirst( ) {
         if (isEmpty( )) return null; // nothing to remove
         return remove(header.getNext( )); // first element is beyond header
         }
 //∗∗ Removes and returns the last element of the list. ∗/
             public E removeLast( ) {
         if (isEmpty( )) return null; // nothing to remove
         return remove(trailer.getPrev( )); // last element is before trailer
         }

         // private update methods
        // /∗∗ Adds element e to the linked list in between the given nodes. ∗/
             private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
         // create and link a new node
         Node<E> newest = new Node<>(e, predecessor, successor);
         predecessor.setNext(newest);
         successor.setPrev(newest);
         size++;
         }

             private E remove(Node<E> node) {
         Node<E> predecessor = node.getPrev( );
         Node<E> successor = node.getNext( );
         predecessor.setNext(successor);
         successor.setPrev(predecessor);
         size--;
         return node.getElement( );
     }

     //------ Q1 -----

    public Node middle(E e) {
         if (header.next==null) return null;
        Node a = header.next;
        Node m = trailer.next;

        while (m != trailer && m.next != trailer) {
            a = a.next;
            m = m.next.next;
        }

        return a;
    }

    // ------Q3------

    public boolean equal(Doubly_linked b) {
        if (b == this) {
            return true;
        }else if (this.size()== b.size()){
            Node n=this.header.getNext();
            Node e=b.header.getNext();
            while (n!=null){
                if (n.getElement() !=e.getElement())return false;
                n=n.getNext();
                e=e.getNext();
            }return true;
        }return false;
    }

    //------- Q4 -----
    public void margen(Doubly_linked b){
         if (!isEmpty() && !b.isEmpty()){
             while (!b.isEmpty()){
addLast( (E)b.removeFirst());
             }
         }
    }

    //------ Q5 -----

    public void ones(){
         trailer.setNext(header.getNext());
         header.getNext().setPrev(trailer);
         header.setNext(null);
    }

}