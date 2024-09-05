import java.util.Scanner;
public class bal{
    public static void main(String[] args){
        String ex= "(9*(7-2)*(1*5))";
        char a='(';                            
        char b=')';
        int w=0;
        int x=0;
        for(int i=0;i<ex.length();i++){
            char c=ex.charAt(i);
            if(c==a){
                w = w+ 1;
            }
            else{
                x = x+ 1;
            }
        }
        if (w==x){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}