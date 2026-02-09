public class Pattern31 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n ;i>=1;i--){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            for(int j =i ;j<=n;j++){
                System.out.print(i);

            }
            System.out.println();
        }
    }
}

/*
Output
    5
   44
  333
 2222
11111
 */
