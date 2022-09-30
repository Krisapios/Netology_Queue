import java.net.ProxySelector;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> clients = new LinkedList<>(generateClients());

        while (!clients.isEmpty()) {
            Person person = clients.poll();


            int tickets = person.getTicket();
            if (tickets > 0) {
                System.out.println(person.surname + " " + person.name + " имеет " + tickets + " билетов");
                person.setTicket(--tickets);
                clients.offer(person);
                System.out.println(person.toString());
            }
        }
        System.out.println("Билеты кончились");
        System.out.println(clients.isEmpty());
    }

    static List<Person> generateClients() {
        return List.of(
                new Person("Иван", "Петров", 2),
                new Person("Евгений", "Букин", 4),
                new Person("Петр", "Жириновский", 0),
                new Person("Артем", "Kи", 9),
                new Person("Данил", "Кораблев", 5)
        );
    }
}

