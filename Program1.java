class Program1{
    public static void main(String args[]){
       /*
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j =5; j>=i;j--){
                  System.out.print(j);
             }
             System.out.println();
        } */

       /*
        int n = 5;
        for(int i = n; i>=1;i--){ // 4
          for(int j = i;j<=n;j++){ //5
                  System.out.print(j);
          }
          System.out.println();
        } */

        /*
        int n = 5;
        for(char i ='A';i<='E';i++){
           for(char j ='A';j<=i;j++){
               System.out.print(i);
           }
           System.out.println();
        } */

        /*int n = 5;
        for(char i ='e';i>='a';i--){
           for(char j =i;j>='e';j--){
               System.out.print(i);
           }
           System.out.println();
        } 
*/
        int n = 5;
        for(int i =5;i>=1;i--){
           for(int j=i ;j<=n;j++){
               System.out.print((char)(i+96));
           }
           System.out.println();
        }
    
    }
}

/* 
5
54
543
5432
54321
*/

/*
5
45
345
2345
12345
*/

/*
A
BB
CCC
DDDD
EEEEE 
*/