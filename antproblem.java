import java.util.Scanner;

public class antproblem {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
		int n=4;
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(s[i].equals("red")){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count1==count2){
            System.out.println("peaceful");
        }
        else{
            System.out.println("Not peaceful");
        }

    }
}
