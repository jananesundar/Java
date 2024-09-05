import java.util.*;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private MenuItem menuItem;
    private int quantity;

    public Order(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public String toString() {
        return menuItem.getName() + " - " + quantity + " x " + menuItem.getPrice() + " = " + getTotalPrice();
    }
}

class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public MenuItem getItem(int index) {
        return menuItems.get(index);
    }

    public int getSize() {
        return menuItems.size();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - Rs." + item.getPrice());
        }
        System.out.println();
    }
}

public class Northindian {
	void northindian()
	{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = createMenu();

        List<Order> orders = new ArrayList<>();

        while (true) {
            menu.displayMenu();

            System.out.print("Enter item number (0 to finish): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > menu.getSize()) {
                System.out.println("Invalid choice. Please try again.\n");
                continue;
            }

            MenuItem menuItem = menu.getItem(choice - 1);

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            Order order = new Order(menuItem, quantity);
            orders.add(order);

            System.out.println("Item added to the order.\n");
        }

        double totalBill = 0.0;
        System.out.println("Order Details:");
        for (Order order : orders) {
            System.out.println(order);
            totalBill += order.getTotalPrice();
        }
        System.out.println("Total Bill: Rs" + totalBill);

        scanner.close();
    }

    private static Menu createMenu() {
        Menu menu = new Menu();

        // Add menu items
        menu.addItem(new MenuItem("North Indian Thali", 250));
        menu.addItem(new MenuItem("South Indian Thali", 300));
        menu.addItem(new MenuItem("Chinese Platter", 400));
        menu.addItem(new MenuItem("cool drinks", 80));
        menu.addItem(new MenuItem("Ice Cream", 20));

        return menu;
	}
    }
}