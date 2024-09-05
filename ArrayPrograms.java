import java.util.Scanner;
public class ArrayPrograms {
    public static void main(String args[]){
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum is:"+sum);
        float avg=sum/n;
        System.out.println("Avg is :"+avg);
        int min=a[0];
        int max=0;
        for(i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){ 
                min=a[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        System.out.println("Enter a element:");
        int element =sc.nextInt();
        int b=-1;
        for(i=0;i<n;i++){
            if(element==a[i]){
                b=i;
                break;
            }
        }
        if(b!=-1){
        System.out.println("Element found at index:"+b);
        }
        else{
            System.out.println("element is not found:"+b);
        }
        int number;
        System.out.println("Enter the element to ascii value:");
        number=sc.nextInt();
        System.out.println("Value is:"+(char)number);
        int temp=0;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]+" ");
        }
        System.out.println("The first two largest number is:"+a[n-1]+" "+a[n-2]);
        System.out.println("The first two smallest number is:"+a[0]+" "+a[1]);
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j++){
                if(a[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(a[i]); 
            }
        }
        int adde;
        for(i=0;i<n;i++){
            if(a[i]==6){
                while(i<n&&a[i]!=7){
                    i++;
                }
            }
            else{
                adde+=a[i];
            }
        }
        System.out.println(adde);
    }    
}

