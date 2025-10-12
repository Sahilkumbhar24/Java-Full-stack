public class Pattern85 {
    public static void main(String[] args) {
        int n = 5;
        int count1 = 1;
        int count2 = (n*(n+1))/2;
        for(int i = n;i>=1;i--){
            int c1 = count1;
            int c2 =count2;
            for(int j =i,j1=n;j<=n || j1>=i;j++,j1--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96));
                System.out.print("\t");
                c1-=j;
                c2-=j1-1;
            }
            System.out.println();
            count1+=i;
            count2--;
        }
    }
}

/*
Output
Ao
Fn      Bj
Jm      Gi      Cf
Ml      Kh      He      Dc
Ok      Ng      Ld      Ib      Ea
 */