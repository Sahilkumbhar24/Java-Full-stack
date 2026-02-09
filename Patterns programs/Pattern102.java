public class Pattern102 {
    public static void main(String args[]){
        int n = 5;
        int count = n;
        for(int i=n;i>=1;i-- ){
            int c = count;
            for(int j =n;j>=i;j-- ){
                System.out.print((char)(c+64));
                c+=j;
            }
            System.out.println();
            count--;
        }
    }
}
/*
Output
E
DI
CHL
BGKN
AFJMO
 */
