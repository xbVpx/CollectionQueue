import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queuePassengers = new <Person>LinkedList(generateClients());
        while (!queuePassengers.isEmpty()) {
            Person nextPassenger = queuePassengers.poll();
            System.out.println(nextPassenger + " прокатился на аттракционе!");
            int ticketCount = nextPassenger.getTickets();
            if (ticketCount > 1) {
                queuePassengers.offer(nextPassenger);
                nextPassenger.setTickets(ticketCount - 1);
            }
        }
    }
    public static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Иванов", "Иван", 3));
        personList.add(new Person("Петров", "Петр", 15));
        personList.add(new Person("Сидоров", "Анатолий", 1));
        personList.add(new Person("Игнатьев", "Александр", 3));
        personList.add(new Person("Макаров", "Игорь", 2));
        return (personList);
    }
}