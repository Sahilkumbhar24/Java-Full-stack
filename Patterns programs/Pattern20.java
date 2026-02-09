public class Pattern20 {
    public static void main(String[] args) {
        int n =5;
        for(int i = 5;i>=1;i--){
            for(int j = i;j<=n;j++){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}

/*
Output
e
de
cde
bcde
abcde
 */
