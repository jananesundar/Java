public class mettltool1 {
    //second last digit
    public static void lastdigit(int n){
        System.out.println((n%100)/10);
    }
    //calculate sum of last digit of two numbers
    public static void sumlastdigit(int input1,int input2){
        int n=input1%10;
        int m=input2%10;
        System.out.println("Sum of last 2 digit: "+(n+m));
    }
    //count no. of even
    public static void counteven(int input1,int input2,int input3,int input4,int input5){
        int count =0;
        if(input1%2==0){
            count++;
        }
        if(input2%2==0){
            count++;
        }
        if(input3%2==0){
            count++;
        }
        if(input4%2==0){
            count++;
        }
        if(input5%2==0){
            count++;
        }
        System.out.println("Count: "+count);
    }
        //count no. of odd
    public static void countodd(int input1,int input2,int input3,int input4,int input5){
        int count =0;
        if(input1%2!=0){
            count++;
        }
        if(input2%2!=0){
            count++;
        }
        if(input3%2!=0){
            count++;
        }
        if(input4%2!=0){
            count++;
        }
        if(input5%2!=0){
            count++;
        }
        System.out.println("Count: "+count);
    }
    //nth prime
    public static int nthPrime(int input1) {
        int num = 1, count = 0, i;
        while(count < input1){
            num++;
            for (i = 2; i <= num; i++)
                if (num % i == 0) 
                    break;
            if (i == num) 
                count++;
        }
        return num;
    }
    public static void main(String[] args) {
        lastdigit(123456);
        sumlastdigit(123, 234);
        counteven(1, 2, 3, 4, 5);
        countodd(1, 2, 3, 4, 5);
        System.out.println(nthPrime(3));
    }
}
