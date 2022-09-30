import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        if (clients.isEmpty()) {
            System.out.println("Билеты кончились");
        }

        System.out.println(clients.isEmpty()); // проверка что очередь пустая
    }

    static List<Person> generateClients() {
        return List.of(
                new Person("Иван", "Петров", 1),
                new Person("Евгений", "Букин", 0),
                new Person("Петр", "Жириновский", 2),
                new Person("Артем", "Kи", 3),
                new Person("Данил", "Кораблев", 4)
        );
    }
}

