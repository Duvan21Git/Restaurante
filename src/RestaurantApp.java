import model.Employee;
import model.Menu;
import model.MenuItem;
import model.Order;
import model.OrderItem;
import model.Restaurant;
import model.Table;

public class RestaurantApp {
    public static void main(String[] args) throws Exception {

        MenuItem item1 = new MenuItem(null, "Pasta", 12.99);
        MenuItem item2 = new MenuItem(null, "Pizza", 15.49);
        MenuItem item3 = new MenuItem(null, "Salad", 9.99);
        MenuItem[] menuItems = { item1, item2, item3 };
        Menu menu = new Menu(null, null, menuItems);

        // 3. Crear un array de Table y usarlo para crear un objeto Restaurant
        Table table1 = new Table(1, 4, null);
        Table table2 = new Table(2, 2, null);
        Table table3 = new Table(3, 6, null);
        Table[] tables = { table1, table2, table3 };

        // 4. Crear un array de Employee y usarlo para el mismo Restaurant
        Employee emp1 = new Employee("Carlos", "Mesero");
        Employee emp2 = new Employee("Laura", "Cocinera");
        Employee[] employees = { emp1, emp2 };

        Restaurant restaurant = new Restaurant("La Buena Comida", "Calle Principal", tables, menu, employees);
        System.out.println("Bienvenido a " + restaurant.getName() + " en " + restaurant.getAddress());
        // 5. Mostrar el menú
        restaurant.displayMenu();
        System.out.println("hola  mi nombre es:" + emp1.getRestaurant() + " y soy " + emp1.getNombre()
                + " estas son las mesas disponibles: ");
        // 6. Mostrar las mesas disponibles
        for (Table table : restaurant.getTables()) {
            System.out
                    .println("Mesa #" + table.getTableNumber() + " - Capacidad: " + table.getCapacity() + " personas");
        }
        // Simular que una mesa se ocupa
        System.out.println("Ocupando la mesa #" + table2.getTableNumber());
        table2.setOccupied(true);
        System.out.println("La mesa #" + table2.getTableNumber() + " ahora está ocupada.");

        // 6. Crear un objeto Order (máximo 5 ítems)
        Order order = new Order(table2, 5);
        // 7. Buscar MenuItems en el Menu y crear OrderItems
        MenuItem foundItem1 = menu.findItem("Pizza");
        MenuItem foundItem2 = menu.findItem("Pasta");

        OrderItem orderItem1 = new OrderItem(order, foundItem1);
        OrderItem orderItem2 = new OrderItem(order, foundItem2, 2);
        // 8. Añadir OrderItems al Order
        order.addItem(orderItem1);
        order.addItem(orderItem2);

        // 9. Buscar una mesa en el Restaurant y asignar el Order
        Table foundTable = restaurant.findTable(1);
        foundTable.assignOrder(order);

        // (Si hay relación bidireccional: el Order también sabe a qué mesa pertenece)
        order.setTable(foundTable);

        // 10. Mostrar detalles y total del pedido
        order.displayDetails();
        System.out.println("Total a pagar: $" + order.calculateTotal());

        // 11. Comprobar relación bidireccional (opcional)
        if (order.getTable() != null) {
            System.out.println("Este pedido pertenece a la mesa #" + order.getTable().getTableNumber());
        }
    }
}