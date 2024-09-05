public class hollowsq {
    
    public static void main(String args[]){
        /*int i,j;
        int n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1||i==j||j==i+2){
                    System.out.print("* ");
                }
                
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }*/
        int i,j;
        int n=6;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1||i%2==0 && j%2==0){
                    System.out.print("* ");
                }
                else if(i%2!=0||j%2!=0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
