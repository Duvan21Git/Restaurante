package model;

public class Menu {
    private String name;
    private Restaurant restaurant;
    private MenuItem[] menuItems;

    public Menu(String name, Restaurant restaurant, MenuItem[] menuItems) {
        this.name = name;
        this.restaurant = restaurant;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void displayItems() {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
    }

    public MenuItem findItem(String itemName) {
        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i] != null && menuItems[i].getName().equals(itemName)) {
                return menuItems[i];
            }
        }
        return null;
    }
}