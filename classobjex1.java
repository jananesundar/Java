public class classobjex1 {
    int puppyage;
    public classobjex1(String name){
        System.out.println("Name is:"+name);
    }
    public void setage(int age){
        puppyage=age;
    }
    public int getage(){
        System.out.println("Puppy's age:"+puppyage);
        return puppyage;
    }
    public static void main(String[] args) {
        classobjex1 ex = new classobjex1("tom");
        ex.setage(2);
        ex.getage();
        System.out.println(ex.puppyage);
    }
}
