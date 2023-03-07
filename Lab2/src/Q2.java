import java.util.Arrays;
import java.util.Collections;
/*2. Write a Java method that Clone an array to a backup array.
 */
public class Q2 {
    public static void main(String[] args)
    {
int Array []= {10,12,13,15};
int CopyArray[] = new int[Array.length];
        for (int i = 0; i <Array.length ; i++)
            CopyArray[i]=Array[i];
           // CopyArray[0];
            System.out.print("Array Element = [ ");
            for (int i = 0; i <Array.length ; i++)
                System.out.print(+Array[i]+" ");
        System.out.println(" ]");
        System.out.print("CopyArray Element = [ ");
        for (int i = 0; i <CopyArray.length ; i++)
            System.out.print(CopyArray[i] + " ");
        System.out.print("]");
        }
    }

