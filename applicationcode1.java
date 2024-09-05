public class applicationcode1 {
    public static void main(String args[]){
        int n=4;
        int m=3;
        int bus=0;
        int capacity=0;
        int a[]={1,2,1,2 };
        for(int i=0;i<n;i++){
            int size=a[i];
            if(capacity+size<=m){
                capacity+=size;
            }
            else{
                bus++;
                capacity=size;
            }
        }
        if (capacity >0){
            bus++;
        }
        System.out.println(bus);
    }
}
