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

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = createMenu();

        List<Order> orders = new ArrayList<>();

        while (true) {
            menu.displayMenu();

            System.out.print("Enter item number (Enter 0 to view BILL): ");
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
	
	
	System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       Thank You!           *");
        System.out.println("*                            *");
        System.out.println("******************************");

        scanner.close();
    }

    private static Menu createMenu() {
        Menu menu = new Menu();

	
	System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*  Welcome To Pizza Zone!!! *");
        System.out.println("*                            *");
        System.out.println("******************************");

        // Add menu items
        menu.addItem(new MenuItem("Margerita Pizza", 250));
        menu.addItem(new MenuItem("Pepperoni", 300));
        menu.addItem(new MenuItem("BBQ Chicken Pizza", 400));
        menu.addItem(new MenuItem("Veg delight Pizza", 250));
        menu.addItem(new MenuItem("Four Cheese Pizza", 330));
	menu.addItem(new MenuItem("Meditarrian Pizza", 370));
	menu.addItem(new MenuItem("Cheese loaded Pizza", 400));
	menu.addItem(new MenuItem("Italian Pasta Pizza", 320));
	menu.addItem(new MenuItem("Paneer Delight Pizza", 120));
	menu.addItem(new MenuItem("Meditarrian Pizza", 380));
	menu.addItem(new MenuItem("Mushroom Pizza", 250));
	menu.addItem(new MenuItem("Chilli Pizza", 150));
	menu.addItem(new MenuItem("Chicken tikka Pizza", 370));
	menu.addItem(new MenuItem("Plain cheese Pizza", 120));
	menu.addItem(new MenuItem("Paratha Pizza", 390));
	menu.addItem(new MenuItem("Garlic Prawn Pizza", 350));
	
        return menu;
    }
}