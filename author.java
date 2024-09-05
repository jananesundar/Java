public class author {
    private String name;
    private String email;
    private char gender;

    public author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private author au;
    private double price;
    private int qtyInStock;

    public Book(String name, author au, double price, int qtyInStock) {
        this.name = name;
        this.au = au;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(author au) {
        this.au = au;
    }

    public author getAuthor() {
        return au;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", " + au + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }

    public static void main(String[] args) {
        author a = new author("John Doe", "john.doe@example.com", 'M');
        Book book = new Book("Java Programming", a, 29.95, 100);
        System.out.println(book);
    }
}
