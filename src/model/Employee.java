package model;

public class Employee {
    private String nombre;
    private Restaurant restaurant;

    public Employee(Restaurant restaurant, String nombre) {
        this.restaurant = restaurant;
        this.nombre = nombre;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getNombre() {
        return nombre;
    }
}