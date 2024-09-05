import java.util.Scanner;

public class nonmatch {
    public static void main(String args[]){
        int i ,j,flag=0;
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String s =sc.nextLine();
        int n=a.length();
        int m=s.length();
        for (i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(a.charAt(i)==s.charAt(j)){
                    flag++;
                }

            }
        
        }
        if(flag==0){
            System.out.println();
        }
    }
        
    }
