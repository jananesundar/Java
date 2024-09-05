import java.util.Scanner;

public class nonrepeatingchar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String[] s=new String[];
        int i,j=a.length()-1,k,count;
       for(i=0;i<j;i++){
        count=0;
        for(k=0;k<j;k++){
            if(s[i]==s[j]&&i!=0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.print(s[i]);
            break;
        }
       }
        
    }
}
