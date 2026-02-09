public class Pattern122 {
    public static void main(String[] args) {
        int n = 6;
        int count = n/2;
        for(int i = 1;i<=n;i++){
            int c=count;
            for(int j = 1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(1);
                }else{
                    System.out.print((char)(c+64));
                    c--;
                }
            }
            System.out.println();
        }
    }
}

/*Output
1
1C
1C1
1C1B
1C1B1
1C1B1A
 */


 // good Bye friends
 // good night 