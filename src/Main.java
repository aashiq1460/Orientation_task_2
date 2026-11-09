
public class Main {

    public static void main(String[] args) {

        EventList list = new EventList();

        list.addEvent(new Event(5.0, EventType.ARRIVAL));
        list.addEvent(new Event(2.0, EventType.EXIT));
        list.addEvent(new Event(8.0, EventType.ARRIVAL));
        list.addEvent(new Event(3.0, EventType.EXIT));

        System.out.println("All events:");
        list.printEvents();

        System.out.println("\nNext event:");
        System.out.println(list.getNextEvent());

        System.out.println("\nRemaining events:");
        list.printEvents();
    }
}
