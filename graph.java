public class graph {
    void create(int graph[][],int vertex,Scanner sc){
        for(int i-0;i<vertex;i++){
            for(int j=0;j<vertex;j++){
                if(i==j){
                    continue;
                }
                System.out.println("Do you want to make a edge b/w"+i+" "+j+"(Y/N)");
                char flag=sc.next().charAt(0);
                flag=(flag=='y'||flag=='Y')?'Y':'N';
                if(flag=='y'){
                    graph[i][j]=1;
                }
            }
        }
    }
    void add_edge(int graph[][],int v,int u){
        graph[v][u]=0;
        graph[u][v]=1;
    }
    void display(int graph[][],int vertex){
        for(int i=0;i<vertex;i++){
            for(int j=0;j<vertex;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    void display1(int graph[][],int vertex){
        for(int i=0;i<vertex;i++){
            System.out.println(i+"->");
            for(int j=0;j<vertex;j++){
                if(graph[i][j]==i){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        graph g=new graph();
        int vertex=5;
        int graph[][]=graph[vertex][vertex];
        
    }
}
