public class Pattern84 {
    public static void main(String[] args) {
        int n = 5;
        int count1=1;
        int count2 = (n*(n+1))/2;
        for(int i =1;i<=n;i++){
            for(int j =i;j<=n;j++){
                System.out.print((char)(count1+64));
                System.out.print((char)(count2+96));
                System.out.print("\t");
                count1++;
                count2--;

            }
            System.out.println();
        }
    }
}

/*
Output
Ao      Bn      Cm      Dl      Ek
Fj      Gi      Hh      Ig
Jf      Ke      Ld
Mc      Nb
Oa
 */