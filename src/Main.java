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
                person.setTicket(--tickets);
                System.out.println(person.surname + " " + person.name + " прокатился на аттракционе ");
            }
            if (tickets > 0) { // если после катания билет остался, то добавляем обратно в очередь
                clients.offer(person);
            }
        }
        if (clients.isEmpty()) {
            System.out.println("Билеты кончились");
        }
    }

    static List<Person> generateClients() {
        return List.of(
                new Person("Иван", "Петров", 1),
                new Person("Евгений", "Букин", 1),
                new Person("Петр", "Жириновский", 0),
                new Person("Артем", "Kи", 3),
                new Person("Данил", "Кораблев", 2)
        );
    }
}

