public class Pattern103 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i=1;i<=n;i++ ){
            int c = count;
            for(int j =n;j>=i;j-- ){
                System.out.print((char)(c+64));
                c+=j;
            }
            System.out.println();
            count++;
        }
    }
}
/*
Output
AFJMO
BGKN
CHL
DI
E
 */
