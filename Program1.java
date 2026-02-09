public class Program1{
    public static void main(String args[]){
        int n = 5;
        // for(int i=1;i<=n;i++ ){
        //     if(i<n){
        //         for(int j = i;j>=1;j--){
        //             System.out.print(" ");
        //         }
        //         for(int j = i;j>=1;j--){
        //             System.out.print(j);
        //         }
        //     }
            
        // }

        /*
        EEEEE
         DDDD
          CCC
           BB
            A
           BB
          CCC
         DDDD
        EEEEE
         

        for(int i = 1;i<=(n*2)-1;i++){
            if(i<=n){
                for(int j = i;j>1;j--){
                    System.out.print(" ");
                }
                for(int j = i;j<=n;j++){
                    System.out.print((char)((n-i+1)+64));
                }
            }else{
                for(int j =i;j<(n*2)-1;j++){
                    System.out.print(" ");
                }
                for(int j = i;j>=n;j--){
                    System.out.print((char)((i-n+1)+64));
                }
            }
            System.out.println();
        }*/
        // for(int i =1 ;i<=(n*2)-1;i++){
        //     if(i<=n){
        //         for(int j=i;j<n;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             if(j%2!=0){
        //                 System.out.print((char)(j+64));
        //             }else{
        //                 System.out.print((char)(j+96));
        //             }
        //         }
                    
                
        //     }else{
        //         for(int j=i;j>n;j--){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=(n*2)-i;j++){
        //             if(j%2!=0){
        //             System.out.print((char)(j+64));
        //             }else{
        //                 System.out.print((char)(j+96));
        //             }
        //         }
        //     }
        //     System.out.println();
        //     }
            // }
            
            for(int i = 1;i<=(n*2)-1;i++){
                if(i<=n){
                    for(int j = i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int j = n;j>=n-i+1;j--){
                        if(j%2!=0){
                            System.out.print((char)(j+64));
                        }else{
                            System.out.print((char)(j+96));
                        }
                    }
                }else{
                    for(int j = i;j>n-1;j--){
                        System.out.print(" ");
                    }
                    for(int j = n;j>=i-n+1;j--){
                        if(j%2!=0){
                            System.out.print((char)(j+64));
                        }else{
                            System.out.print((char)(j+96));
                        }
                    }
                }
                System.out.println();
    
            }
        }
    }
