//WAP to merge two array

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        int a[] = {10,20,30,50};
        int b[]={11,22,33,44};
        //int c[] = new int[a.length+b.length];
        // for(int i =0;i<a.length;i++){
        //     c[i]=a[i];
        // }
        // for(int i =0;i<b.length;i++)
        //     c[a.length+i]=b[i];
        // System.out.println(Arrays.toString(c));

        //             OR
        
        int c[]=Arrays.copyOf(a,a.length+b.length);
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        System.out.println(Arrays.toString(c));
        //Output - [10, 20, 30, 40, 50, 11, 22, 33, 44]
    }
}
