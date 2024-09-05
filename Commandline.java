public class Commandline{
    public static void main(String args[]) 
    {
        if(args.length!=2){
            return;
        }
        String str1=args[0];
        String str2=args[1];
       System.out.println("frist string:"+str1);
       System.out.println("sec string:"+str2);

    }
}