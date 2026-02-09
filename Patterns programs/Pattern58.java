public class Pattern58 {
    public static void main(String[] args) {
        int n = 5;
        int count = 11;
        for(int i = n;i>=1;i--){
            int c = count;
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j+1;
            }
            System.out.println();
            count-=i-1;
        }
    }
}

/*
Output
11
7       12
4       8       13
2       5       9       14
1       3       6       10      15
 */
