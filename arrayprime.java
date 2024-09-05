import java.util.Scanner;

public class arrayprime {
    public static void main(String[] args){
        System.out.println("Enter the size:");
        Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(isPrime(a[i])){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}