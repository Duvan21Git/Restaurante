package model;

public class Table {
    private Integer tableNumber;
    private Integer capacity;
    private Boolean occupied;
    private Restaurant restaurant;
    private Order currentOrder;

    public Table(Integer tableNumber, Integer capacity, Restaurant restaurant) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.restaurant = restaurant;
        this.occupied = false;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void assignOrder(Order order) {
        this.currentOrder = order;
        this.occupied = true;
    }

    public void clearTable() {
        this.currentOrder = null;
        this.occupied = false;
    }
}