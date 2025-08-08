import model.Employee;
import model.Menu;
import model.Order;
import model.OrderItem;
import model.Restaurant;
import model.Table;

public class RestaurantApp {
    public static void main(String[] args) throws Exception {

        Restaurant restaurant1 = new Restaurant("La buena mesa", "Calle Falsa 123", null, null, null);
        System.out.println("Nombre del restaurante: " + restaurant1.getName());
        System.out.println("Dirección del restaurante: " + restaurant1.getAddress());

        Employee employee1 = new Employee(restaurant1, "Juan Pérez");
        System.out.println("Nombre del empleado: " + employee1.getNombre());

        Table table1 = new Table(1, 7, restaurant1);
        Table table2 = new Table(2, 4, restaurant1);

        System.out.println("Número de mesa: " + table1.getTableNumber());
        System.out.println("Capacidad de la mesa: " + table1.getCapacity());
        System.out.println("¿Está ocupada la mesa? " + table1.isOccupied());
        Menu menuItem1 = new Menu("Menú Principal", restaurant1, null);
        System.out.println("Nombre del menú: " + menuItem1.getName());
        System.out.println("Restaurante del menú: " + menuItem1.getRestaurant().getName());
        Order order1 = new Order(table1, 5);
        System.out.println("Número de pedido: " + order1.getOrderNumber());
        System.out.println("Estado del pedido: " + order1.getStatus());
        System.out.println("Mesa del pedido: " + order1.getTable().getTableNumber());

        OrderItem orderItem1 = new OrderItem(order1, null);
        System.out.println("Cantidad del ítem del pedido: " + orderItem1.getQuantity());
        System.out.println("Ítem del menú del ítem del pedido: " + orderItem1.getMenuItem());

    }
}