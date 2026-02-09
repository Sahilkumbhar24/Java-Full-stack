public class Pattern86 {
    public static void main(String[] args) {
        int n = 5,count1 = 1,count2 = 1;
        
        for(int i =1;i<=n;i++ ){
            int c1 = count1;
            int c2 =count2;
            for(int j=i,j1=n;j<=n || j1>=i;j++,j1--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96));
                System.out.print("\t");
                c1+=j+1;
                c2+=j1;
            }
            System.out.println();
            count1+=i;
            count2++;
        }
}
}

/*
Output
Aa      Cf      Fj      Jm      Oo
Bb      Eg      Ik      Nn
Dc      Hh      Ml
Gd      Li
Ke
 */