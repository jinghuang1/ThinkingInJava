package thinkingInJava.array.realFucInArray;

import java.lang.reflect.Array;
import java.util.Arrays;

//Using Arrays.equals()
public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        System.out.println(Arrays.equals(a1, a2));              //true
        a2[3] = 11;
        System.out.println(Arrays.equals(a1, a2));              //false
        String[] s1 = new String[4];
        Arrays.fill(s1, "Hi");
        String[] s2 = {new String("Hi"), new String("Hi"),
        new String("Hi"), new String("Hi")};
        //through Object.equals() compare
        System.out.println(Arrays.equals(s1, s2));              //true
    }
}
