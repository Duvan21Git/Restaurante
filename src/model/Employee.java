package model;

public class Employee {
    private String nombre;
    private String restaurant;

    public Employee(String restaurant, String nombre) {
        this.restaurant = restaurant;
        this.nombre = nombre;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getNombre() {
        return nombre;
    }
}