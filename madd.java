import java.util.Scanner;
public class madd{
public static void main(String[] args)
{
int rows,cols,sumcol=0,sumrow=0;
int a[][]={{2,4,5},{1,3,6},{7,8,9}};
rows=a.length;
cols=a[0].length;
for(int i = 0; i < rows; i++){        
	for(int j = 0; j < cols; j++){    
	sumrow = sumrow + a[i][j];    
	}    
		System.out.println("Sum of " + (i+1) +" row: " + sumrow);    
	}  
        for(int i = 0; i < cols; i++){      
            for(int j = 0; j < rows; j++){    
            sumcol = sumcol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumcol);    
        }    
    }    
}    