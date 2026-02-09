//WAP to find nearest number

import java.util.*;
public class Program1{
    public static void main(String[] args) {
        int a[] = {10,14,7,25145,8,11};
        Arrays.sort(a);
        int min = a[a.length-1];
        for(int i = 0;i<a.length-1;i++){
            int temp = Math.abs(a[i]-a[i+1]);
            if(min>temp&&temp!=0){
                min=temp;
            }
        }
       for(int i =0;i<a.length-1;i++){
            int temp=Math.abs(a[i]-a[i+1]);                if(temp==min)
                System.out.println(a[i]+"\t"+a[i+1]);
        }
        

    }
}