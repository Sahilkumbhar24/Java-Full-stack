public class Pattern92 {
    public static void main(String args[]){
        int n = 5;
        int count1 = n;
        int count2 = n;
        for(int i =1,i1=n;i<=n && i1>=1;i++,i1--){
            int c1 = count1;
            int c2 = count2;
            for(int j = n;j>=i;j--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64));
                System.out.print("\t");
                c1--;
                c2+=j-1;
            }
            System.out.println();
            count1+=i1-1;
            count2--;
        }
    }
}

/*
output
EE      DI      CL      BN      AO
ID      HH      GK      FM
LC      KG      JJ
NB      MF
OA
 */
