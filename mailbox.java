import java.util.Scanner;

public class mailbox {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.err.println();
        }
    }
}
