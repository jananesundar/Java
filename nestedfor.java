import java.util.Scanner;
public class nestedfor
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int rows,columns;
        String sym="";
        System.out.println("Enter the no of rows");
        rows=scanner.nextInt();
        System.out.println("Enter the no of columns");
        columns=scanner.nextInt();
        System.out.println("Enter the symbol");
        sym=scanner.next();
        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(sym);
            }
        }
    }
}
