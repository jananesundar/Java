public class countevenfreq {
    public static void main(String[] args){
        int count=1;
        int sum=0;
        String str="aabb";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count+=1;
            }
            else
        {
            if(count%2 ==0){    
                sum+=count;
            }
                count=1;
        }
        }
        if(count%2==0)sum+=count;
        System.out.println(sum);
    }
}
