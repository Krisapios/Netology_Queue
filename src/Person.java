public class Person {
    protected String name;
    protected String surname;
    protected int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String toString() {
        return name + " " + surname + " прокатился на атракционе. Осталось билетов: " + ticket;
    }

    public int getTicket() {
        return ticket;
    }
}
