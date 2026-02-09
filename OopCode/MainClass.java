
public class MainClass {
    // WAM to find second last digit of given number
    static int secLastDig(int n){
        int secLast=n/10;
        return secLast%10;
    }
    //WAM to find first digit of a number
    static int firstDigit(int n){
        while(n>10){
            n/=10;
        }
        return n;
    }

    //WAM to method to find second digit of number
    static int secDig(int n){
        while(n>100){
            n/=10;
        }
        int secdig=n%10;
        return secdig;
    }

    //WAM to find sum of digit of numbers
    static int sumDig(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    //WAM to find max digit of number 
    static int maxDig(int n){
        int max=0;
        while(n>0){
            int dig=n%10;
            if(max<dig){
                max=dig;
            }
            n/=10;
        }
        return max;
    }

    //WAM to find average of digits
    static double avgDig(int n){
        int sum=0;
        int countdig=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
            countdig++;
        }
        double avg = (double)sum/countdig;
        return avg;
    }

    //WAM to merge 2 numbers
    static int mergeNumber(int a,int b){
        int temp=b;
        while(temp!=0){
            a*=10;
            temp/=10;
        }
        return a+b;
    }

    //WAM to shift digit to last
    static int shiftDig(int n){
        int first =n; //considered temperary variable to go through all digits
        int length=1; //stores length of whole number
        while(first>9){ // this runs till 2nd number & gives 1st number
            first/=10;
            length*=10;
        }
        n%=length;
        n*=10;//this gives digit from 2nd to last
        return n+first;
    }

    //WAM to shift last digit to first
    static int lastToFirst(int n){
        int last = n%10; //store last digit
        n/=10; //removed last digit from number
        int temp=n;
        while(temp!=0){
            last*=10; //adjusting last digit to the first place digit
            temp/=10;
        }
        return last+n;
    }

    //WAM to shift sum at last of digit
    static int sumDigitLast(int n){
        int sum=0; //initially initialize sum to 0
        int num=n; //to work on given number using another variable
        while(num!=0){  //calculating sum
            sum+=num%10; //adding last digit of number
            num/=10;//removing that added last digit 
        }
        int temp =sum; //this temp variable is used to work on given number
        while(temp!=0){//used to add last places as per the sum
            n*=10;//used to add 0 at the last digit till sum digits
            temp/=10;
        }
        return n+sum;

    }
    //WAP to shift sum at first of digit
    static int sumDigitFirst(int n){
        int sum=0;
        int num=n;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        int temp=n;
        while(temp!=0){
            sum*=10;
            temp/=10;
        }
        return sum+n;
    }

    //WAP to reverse the number
    static int reverseNum(int n){
        int rev=0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        return rev;
    }

    //WAP to check whether the given number is palindrome or not
    static boolean checkPalindrome(int n){
        int temp=n;
        int rev=0;
        while(temp!=0){
            rev*=10;
            rev+=temp%10;
            temp/=10;
        }
        return rev==n;
    }
    //WAP to check given number is prime or not
    static boolean checkPrime(int n){
        boolean b= true;
        if(n==0 || n==1){
            b = false;
        }else{
            for(int i=2;i<n/2;i++){ //loop till half of number where divide can happen
                if(n%i==0){
                    b=false;
                    break;
                }
            }
        }
        return b;
    }

    //WAP to check given number is strong or not
    static boolean checkStrong(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            int fact=1;
            for(int i=1;i<=temp%10;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;

        }
        return sum==n;

    }

    //WAP to check given number is armstrong or not
    static boolean checkArmstrong(int n){
        int temp=n,sum=0,length=0;
        while(temp!=0){
            length++;
            temp/=10;
        }
        temp=n;
        while(temp!=0){
            sum+=Math.pow(temp%10,length);
            temp/=10;
        }
        return sum==n;
    }

    //WAP to check given number is perfect or not
    static boolean checkPerfect(int n){
        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }

    //WAP to check given number is perfect square
    static boolean checkPerfectSquare(int n){
        int sqr =(int)Math.sqrt(n);
        return sqr*sqr==n;
    }

    //WAP to check given number is perfect cube
    static boolean checkPerfectCube(int n){
        int cbrt = (int)Math.cbrt(n);
        return cbrt*cbrt*cbrt==n;
    }


    public static void main(String[] args) {
        
        System.out.println("2nd last digit :"+secLastDig(84225));
        System.out.println("First digit :"+firstDigit(56123));
        System.out.println("2nd digit :"+secDig(56123));
        System.out.println("sum of  digit :"+sumDig(56123));
        System.out.println("max digit :"+maxDig(56123));
        System.out.println("avg of  digit :"+avgDig(56123));
        System.out.println("Merge 2 numbers :"+mergeNumber(2554,811));
        System.out.println("shift 1st digit to last :"+shiftDig(56123));
        System.out.println("shifting last digit to first :"+lastToFirst(845116));
        System.out.println("sum of  digit to last :"+sumDigitLast(442648));
        System.out.println("sum of  digit to first :"+sumDigitFirst(442648));
        System.out.println("Reverse Number :"+reverseNum(442648));
        System.out.println("check palindrom :"+checkPalindrome(442244));
        System.out.println("check prime :"+checkPrime(47));
        System.out.println("Check Strong number :"+checkStrong(40585));
        System.out.println("Check armstrong number :"+checkArmstrong(153));
        System.out.println("Check Perfect number :"+checkPerfect(28));
        System.out.println("Check perfect square:"+checkPerfectSquare(49));
        System.out.println("Check perfect cube:"+checkPerfectCube(27));

        


    }
}
