import java.util.Random;

/*
 Write a Java method that repeatedly selects and removes a random
entry from an array until the array holds no more entries.
* */
public class Q3 {
    public static void main(String[] args) {
    int [] Array = {1,2,3,4,5,6,7,8,9};
    RemoveElements(Array);
}
    static void  RemoveElements(int[]Array){
        Random A = new Random();
        while (Array.length>0){
            int index = A.nextInt(Array.length);
            System.out.println("index = "+index+" ,Element = "+Array[index]);
            int [] Array1 = new int[Array.length-1];
            for (int i = 0; i <index ; i++)
                Array1[i] = Array[i];
            for (int i = index; i < Array.length-1; i++)
                Array1[i] = Array[i+1];
            Array = Array1;
        }
    }
}
