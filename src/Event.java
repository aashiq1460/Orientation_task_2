
public class Event implements Comparable<Event> {

    private double time;
    private EventType type;

    public Event(double time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public int compareTo(Event other) {
        return Double.compare(time, other.time);
    }

    public String toString() {
        return "Event time: " + time + ", Type: " + type;
    }
}
