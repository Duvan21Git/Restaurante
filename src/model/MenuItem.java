package model;

public class MenuItem {
    private Menu menu;
    private String name;
    private Double price;

    public MenuItem(Menu menu, String name, Double price) {
        this.name = name;
        this.price = price;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return String.format("%s: \t$ %,.2f", name, price);
    }

}