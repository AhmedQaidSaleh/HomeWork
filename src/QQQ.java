import java.util.Arrays;
import java.util.Collections;

public class QQQ {

    /**
     public void addLast(E e) {
     addFirst(e);
     tail = tail.getNext( );}
     */
    /**
static void revers(Integer arry[]){
    Collections.reverse(Arrays.asList(arry));
    System.out.println("rever"+Arrays.asList(arry));
}

    public static void main(String[] args) {
        Integer arry[]={1,2,3,4};
        revers(arry);
        System.out.println(Arrays.asList(arry));
    }
     */
    public static void main(String[] args) {
        int arry[]={24,5,6};
        int copyarry[] =new int [arry.length];
        for (int i = 0; i <arry.length ; i++)
        copyarry[i] = arry[i];
        copyarry[0]++;
        System.out.println("arry");
        for (int i = 0; i < arry.length; i++)
            System.out.println(arry[i]);
        System.out.println("copy");
        for (int i = 0; i <copyarry.length ; i++)
            System.out.println(copyarry[i]);





    }
     }
