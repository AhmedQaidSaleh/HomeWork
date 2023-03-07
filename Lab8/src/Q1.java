public class Q1 {
    public static void main(String[] args) {
        ArrayQueue<Integer>  o=new ArrayQueue<>();
        //------ in ArrayQueue  -----
        o.enqueue(5);
        o.enqueue(6);
        o.enqueue(7);
        o.enqueue(8);
        o.enqueue(9);

        System.out.println(o.rotate());

    }
}
