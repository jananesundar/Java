public class box {
    int height, weight, depth;
    public box(int h, int w, int d) {
        height = h;
        weight = w;
        depth = d;
    }

    public void getdata() {
        int volume = height * weight * depth;
        System.out.println("Volume is: " + volume);
    }

    public static void main(String[] args) {
        box b = new box(2, 2, 2);
        b.getdata();
    }
}
