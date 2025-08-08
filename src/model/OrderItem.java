package model;

public class OrderItem {
    private Order order;
    private MenuItem menuItem;
    private Integer quantity;

    public OrderItem(Order order, MenuItem menuItem) {
        this(order, menuItem, 1);
    }

    public OrderItem(Order order, MenuItem menuItem, Integer quantity) {
        this.order = order;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public Order getOrder() {
        return order;
    }

    public Double calculateSubtotal() {
        return menuItem.getPrice() * quantity;
    }
}
