
public class Doubly_linked<E> {
   private static class Node<E>{
       E element;
       Doubly_linked.Node<E> prev;
       Doubly_linked.Node<E> next;

       public Node(E element, Doubly_linked.Node<E> prev, Doubly_linked.Node<E> next) {
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

       public Doubly_linked.Node<E> getPrev() {
           return prev;
       }

       public void setPrev(Doubly_linked.Node<E> prev) {
           this.prev = prev;
       }

       public Doubly_linked.Node<E> getNext() {
           return next;
       }

       public void setNext(Doubly_linked.Node<E> next) {
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
                 Node<E> e = header.next;
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

    public void addFirst(E e) {
         addBetween(e, header, header.getNext( )); // place just after the header

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

    public E middle() {
         if (isEmpty()) return null;
        Node<E> a = header.next;
        Node<E> m = trailer.prev;
        while (a != m) {
            a = a.next;
            if (a==null)
                return m.getElement();
            m = m.prev;
        }
        return a.getElement();
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
    public static void main(String[] args) {
        Doubly_linked L=new Doubly_linked<>();
       // Doubly_linked m=new Doubly_linked<>();
        L.addFirst(6);
        L.addFirst(7);
      //  L.addFirst(8);
        L.addFirst(9);
//        L.addFirst(5);
       // System.out.println(L.isEmpty());
        System.out.println(L.middle());
    }
}