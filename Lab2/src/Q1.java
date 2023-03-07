import java.util.Arrays;
import java.util.Collections;

/*
 Write a Java method that Reverse an array using another array. */
public class Q1 {
    static void reverse (Integer arry[]){
        Collections.reverse(Arrays.asList(arry));
        System.out.println("Reverse Array :"+Arrays.asList(arry));
    }

    public static void main(String[] args) {
        Integer [] arry  = {1,10,20,30,50,60,70,82,99,100};
        System.out.println("Original Array :"+Arrays.asList(arry));
        reverse(arry);
    }

}
