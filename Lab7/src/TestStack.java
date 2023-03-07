public class TestStack {
    public static void main(String[] args) {
      //  SinglyStack<Integer>s=new SinglyStack<>();
        //DoublyStack<Integer>s=new DoublyStack<>();
        ArryStack<Integer>s=new ArryStack<>();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(2);
        s.push(5);
        s.push(7);
        while (!s.isEmpty())
            System.out.println(s.pop());
        //System.out.println(s.top());
    }
}
