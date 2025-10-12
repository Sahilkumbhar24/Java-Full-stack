public class Pattern75 {
    public static void main(String[] args) {
        int n =5;
        int count = 1;
        for(int i =n;i>=1;i--){
            int c = count;
            for(int j = i;j>1;j--){
                System.out.print("\t");
            }
            for(int j = i;j<=n;j++){
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
            count++;
        }
    }
}
/*
Output
                                1
                        2       6
                3       6       10
        4       6       9       13
5       6       8       11      15
 */
