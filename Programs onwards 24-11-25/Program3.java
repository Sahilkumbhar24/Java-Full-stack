//WAP to merge two array alternatively

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int a[] = {10,20,30,50};
        int b[]={11,22,33,44};
        int c[]= new int[a.length+b.length];
        if(a.length<=b.length){
            for(int i =0;i<a.length;i++){
                c[i*2]=a[i];
                c[(i*2)+1]=b[i];
            }
            int count =0;
            for(int i =a.length;i<b.length;i++){
                c[(a.length*2)+count++] =b[i];
            }
        }
        else{
            for(int i=0;i<b.length;i++){
                c[i*2]=a[i];
                c[(i*2)+1]=b[i];
            }
            int count =0;
            for(int i =a.length;i<b.length;i++){
                c[(b.length*2)+count++] =a[i];
            }
            }
            System.out.println(Arrays.toString(c));

        }
        


        //Output - [10, 11, 20, 22, 30, 33, 50, 44]
    }

