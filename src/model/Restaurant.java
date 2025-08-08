package model;

public class Restaurant {
    private String name;
    private String address;
    private Table[] tables;
    private Menu menu;
    private Employee[] employees;

    public Restaurant(String name, String address, Table[] tables, Menu menu, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.tables = tables;
        this.menu = menu;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Table[] getTables() {
        return tables;
    }

    public Menu getMenu() {
        return menu;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void displayMenu() {
        menu.displayItems();
    }

    public Table findTable(int tableNumber) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] != null && tables[i].getTableNumber().equals(tableNumber)) {
                return tables[i];
            }
        }
        return null;
    }

}