public class Q6 {

    public static void main(String[] args) {
        Singly ob=new Singly();
        Singly ob2=new Singly();
        Singly ob3=new Singly();

        ob.addFirst(1);
        ob.addFirst(2);
        ob.addFirst(3);
        ob.addFirst(4);
        ob.reversing();
        ob.print();
        while (!ob.isEmpty()){
            System.out.println(ob.removeFirst());
        }
    }

}
